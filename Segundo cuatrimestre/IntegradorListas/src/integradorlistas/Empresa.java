package integradorlistas;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Sucursal> sucursales;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
    }
    
    public void agregarSucursal(Sucursal sucursal){
        if (sucursal == null) {
            throw new NullPointerException();
        } else {
            sucursales.add(sucursal);
        }
    }
    
    public void listarDispositivos(){
        for (Sucursal suc : sucursales) {
            suc.listarDispositivos();
            System.out.println("--------------------------------------------------------");
        }
    }
    
    public ArrayList<Dispositivo> dispositivosPorTipo(TipoDispositivo tipo){
        ArrayList<Dispositivo> listaRetorno = new ArrayList<>();
        for (Sucursal suc : sucursales) {
            listaRetorno.addAll(suc.dispositivosPorTipo(tipo));
        }
        return listaRetorno;
    }
    
    public double[] porcDispositivosPorTipo(String nomSucursal){
        double[] nums = new double[TipoDispositivo.values().length];
        Sucursal sucursalFound = null;
        int[] conteo = null;
        
        for (Sucursal sucursal : sucursales) {
            if (sucursal.checkNombre(nomSucursal)) {
                sucursalFound = sucursal;
                conteo = sucursal.contarDispositivos();
            }
        }
        
        if (sucursalFound != null && conteo != null) {
            int totalDisp = sucursalFound.totalDispositivos();
            
            for (int i = 0; i < conteo.length; i++) {
                nums[i] = ((double) conteo[i] / totalDisp) * 100;
            }
                
            return nums;
        }
        return null;
    }
}

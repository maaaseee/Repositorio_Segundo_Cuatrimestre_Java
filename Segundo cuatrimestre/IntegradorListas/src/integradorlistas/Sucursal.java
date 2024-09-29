package integradorlistas;

import java.util.ArrayList;
import java.util.Iterator;

public class Sucursal {
    private String nombre;
    private ArrayList<Dispositivo> dispositivos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.dispositivos = new ArrayList<>();
    }
    
    public void agregarDispositivo(Dispositivo disp){
        if (disp == null) {
            throw new NullPointerException();
        } else {
            dispositivos.add(disp);
        }
    }
    
    public void listarDispositivos(){
        if (dispositivos.isEmpty()) {
            System.out.println("No hay dispositivos en esta sucursal.");
        } else {
            for (Dispositivo disp : dispositivos) {
                System.out.println(disp);
            }
        }
    }
    
    public ArrayList<Dispositivo> dispositivosPorTipo(TipoDispositivo tipo){
        ArrayList<Dispositivo> listaRetorno = new ArrayList<>();
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.checkDispositivo(tipo)) {
                listaRetorno.add(dispositivo);
            }
        }
        
        return listaRetorno;
    }
    
    private Dispositivo buscarDispositivo(String ID){
        Iterator<Dispositivo> iterador = dispositivos.iterator();
        
        while (iterador.hasNext()){
            Dispositivo d = iterador.next();
            if (d.checkID(ID)) {
                iterador.remove();
                return d;
            }
        }
        return null;

    }
    
    public Dispositivo borrarDispositivo(String ID){
        Iterator<Dispositivo> iterador = dispositivos.iterator();
        
        while (iterador.hasNext()){
            Dispositivo d = iterador.next();
            if (d.checkID(ID)) {
                iterador.remove();
                return d;
            }
        }
        return null;
    }
    
    public boolean checkNombre(String nombre){
        return this.nombre.equals(nombre);
    }
    
    public int[] contarDispositivos(){
        int[] conteo = new int[TipoDispositivo.values().length];
        if (dispositivos.isEmpty()) {
            return null;
        }
        
        for (Dispositivo dispositivo : dispositivos) {
            conteo[dispositivo.getDispositivoType().ordinal()]++;
        }
        
        return conteo;
    }
    
    public int totalDispositivos(){
        return dispositivos.size();
    }
}

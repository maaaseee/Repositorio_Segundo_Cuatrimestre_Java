package integradorlistas;

public class IntegradorListas {

    public static void main(String[] args) {
        Empresa apol = new Empresa("Apol");
        
        CargarEmpresa(apol);
        
        apol.listarDispositivos();
        
        for (Dispositivo d : apol.dispositivosPorTipo(TipoDispositivo.TABLET)) {
            System.out.println(d);
        }
        
        System.out.println("----------------------------------");
        
        for (double number : apol.porcDispositivosPorTipo("Quilmes 2")) {
            System.out.println(number);
        }
        
        
        /*sucu1.borrarDispositivo("ID001");
        
        apol.listarDispositivos();*/
    }
    public static void CargarEmpresa(Empresa empresa){
        Sucursal sucu1 = new Sucursal("Avellaneda 1");
        Sucursal sucu2 = new Sucursal("Quilmes 2");
        
        empresa.agregarSucursal(sucu1);
        empresa.agregarSucursal(sucu2);
        
        Dispositivo dispositivo1 = new Dispositivo("ID001", 399.99, TipoDispositivo.TELEFONO);
        Dispositivo dispositivo2 = new Dispositivo("ID002", 599.99, TipoDispositivo.TABLET);
        Dispositivo dispositivo3 = new Dispositivo("ID003", 1299.99, TipoDispositivo.COMPUTADORA);
        Dispositivo dispositivo4 = new Dispositivo("ID004", 299.99, TipoDispositivo.TELEFONO);
        Dispositivo dispositivo5 = new Dispositivo("ID005", 699.99, TipoDispositivo.TABLET);
        
        Dispositivo dispositivo6 = new Dispositivo("ID006", 799.99, TipoDispositivo.COMPUTADORA);
        Dispositivo dispositivo7 = new Dispositivo("ID007", 1299.99, TipoDispositivo.TABLET);
        Dispositivo dispositivo8 = new Dispositivo("ID008", 2499.99, TipoDispositivo.COMPUTADORA);
        Dispositivo dispositivo9 = new Dispositivo("ID009", 699.99, TipoDispositivo.TELEFONO);
        Dispositivo dispositivo10 = new Dispositivo("ID010", 1399.99, TipoDispositivo.COMPUTADORA);
        
        sucu1.agregarDispositivo(dispositivo1);
        sucu1.agregarDispositivo(dispositivo2);
        sucu1.agregarDispositivo(dispositivo3);
        sucu1.agregarDispositivo(dispositivo4);
        sucu1.agregarDispositivo(dispositivo5);
        
        sucu2.agregarDispositivo(dispositivo6);
        sucu2.agregarDispositivo(dispositivo7);
        sucu2.agregarDispositivo(dispositivo8);
        sucu2.agregarDispositivo(dispositivo9);
        sucu2.agregarDispositivo(dispositivo10);
        
        
    }
}

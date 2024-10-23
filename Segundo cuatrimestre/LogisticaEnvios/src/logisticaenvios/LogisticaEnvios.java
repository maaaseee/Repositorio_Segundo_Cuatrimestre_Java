package logisticaenvios;

public class LogisticaEnvios {
    
    public static void main(String[] args) {
        EmpresaLogistica empresa = new EmpresaLogistica("Mercado Envíos");
        
        cargarEmpresa(empresa);
        
        empresa.iniciarEntregas();
        
    }
    
    public static void cargarEmpresa(EmpresaLogistica empresa) {
        TransportadorDePaquetes t1 = new DronDeEntrega("Yamato");
        TransportadorDePaquetes t2 = new CamionDeReparto("ABC141", "Fiat");
        TransportadorDePaquetes t3 = new CamionDeReparto("ASD423", "Ford");
        TransportadorDePaquetes t4 = new DronDeEntrega("Ashh");
        TransportadorDePaquetes t5 = new Delivery("Pepe");
        
        empresa.agregarTransportador(t1);
        empresa.agregarTransportador(t2);
        empresa.agregarTransportador(t3);
        empresa.agregarTransportador(t4);
        empresa.agregarTransportador(t5);
    }
}
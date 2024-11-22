package bolillero;

//import bolillero.AutoF1;
//import bolillero.Escuderia;

public class main {

    public static void main(String[] args) {
        BolilleroF1 bol = new BolilleroF1();
        
        System.out.println("Comenzando el bingo...");
        
        AutoF1[] autos = {
            new AutoF1("Colapinto", Escuderia.Williams),
            new AutoF1("Albon", Escuderia.Williams),
            new AutoF1("Sainz", Escuderia.Ferrari),
            new AutoF1("Lawson", Escuderia.Mercedes)
        };
        cargarBolilleroF1(bol, autos);
        
        while (bol.quedanBolillas()) {
            esperar(1);
            System.out.println(bol.getBolillaSinReposicion());
        }
    }
    
    public static void cargarBolillero(Bolillero bol, int limite) {
        for (int i = 1; i <= limite; i++) {
            bol.agregarBolilla(i);
        }
        System.out.println("Bolillero cargado!");
    }
    
    public static void cargarBolilleroF1(BolilleroF1 bol, AutoF1[] autos) {
        for (int i = 0; i < autos.length; i++) {
            bol.agregarBolilla(autos[i]);
        }
        System.out.println("Bolillero cargado!");
    }
    
    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}

package halloween;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Criatura c1 = new Criatura("Alma errante", 57);
        Criatura c2 = new Criatura("Metamorfo", 69);
        Espectro e1 = new Espectro("Oscuridad profunda", 78, 8);
        Espectro e2 = new Espectro("Silbido espectral", 49, 7);
        Fantasma f1 = new Fantasma("Lamento agónico", 45, 9, 0.6);
        Fantasma f2 = new Fantasma("Casper", 65, 99, 0.9);
        
        List<Criatura> criaturas = new ArrayList<>();
        criaturas.add(c1);
        criaturas.add(c2);
        criaturas.add(e1);
        criaturas.add(e2);
        criaturas.add(f1);
        criaturas.add(f2);
        
        List<Espectro> espectros = new ArrayList<>();
        espectros.add(e1);
        espectros.add(e2);
        espectros.add(f1);
        espectros.add(f2);
        
        List<Fantasma> fantasmas = new ArrayList<>();
        fantasmas.add(f1);
        fantasmas.add(f2);
        
        List<Aterrable> aterrables = new ArrayList<>();
        espectros.add(e1);
        espectros.add(e2);
        espectros.add(f1);
        espectros.add(f2);
    }
}

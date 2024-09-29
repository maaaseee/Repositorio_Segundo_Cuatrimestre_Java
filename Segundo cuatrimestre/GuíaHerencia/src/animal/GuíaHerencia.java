package animal;

public class GuíaHerencia {

    public static void main(String[] args) {
        Perro p1 = new Perro("Carlito", 10);
        Gato g1 = new Gato("Mimi", 5);
        
        p1.hacerSonido();
        g1.hacerSonido();
    }

}

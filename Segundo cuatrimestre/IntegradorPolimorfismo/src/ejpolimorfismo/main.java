package ejpolimorfismo;

public class main {

    public static void main(String[] args) {
        A instancia;
        
        instancia = new C();
        
        System.out.println(instancia.m1());
        System.out.println(instancia.m2());
        System.out.println(instancia.m3());
    }
    
}

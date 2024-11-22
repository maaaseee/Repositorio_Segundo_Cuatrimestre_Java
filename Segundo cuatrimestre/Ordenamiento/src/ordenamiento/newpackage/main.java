package ordenamiento.newpackage;

import java.util.Comparator;

public class main {

    public static void main(String[] args) {
        Persona2 unaP = new Persona2(1234, "Juan", 'm');
        
        mostrarPersona(new Comparator<Persona2>() {
            @Override
            public int compare (Persona2 p1, Persona2 p2){
                return 0;
            }
        }
        );
    }
    
    public static void mostrarPersona(Comparator<Persona2> p){
        System.out.println(p);
    }
}

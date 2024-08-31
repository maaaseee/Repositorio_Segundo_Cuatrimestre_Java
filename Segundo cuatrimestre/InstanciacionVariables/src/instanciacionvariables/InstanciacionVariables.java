package instanciacionvariables;

/**
 Declara e inicializa variables de los siguientes tipos primitivos:
 int, double, boolean, char.
 Imprime los valores de estas variables en la consola.
 */
public class InstanciacionVariables {
    
    public static void main (String[] args) {
        int entero = 19;
        double recontraEntero = 19 / 2;
        boolean falso = !true;
        char caracter = 78;
        
        System.out.println(entero);
        System.out.println(recontraEntero);
        System.out.println(falso);
        System.out.println(caracter);
        
        Persona persona1 = new Persona("Carlos", 25);
        Persona persona2 = new Persona("Juana", 46);
        
        System.out.println(persona1.getName());
        System.out.println(persona1.getAge());
        System.out.println(persona2.getName());
        System.out.println(persona2.getAge());
        
        persona1.changeName("Carlitos");
        persona2.changeAge(47);
    }
}


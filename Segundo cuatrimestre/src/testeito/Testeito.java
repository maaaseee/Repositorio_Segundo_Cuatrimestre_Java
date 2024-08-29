package testeito;



public class Testeito {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola marce!");
        
        int edad = 4;
        
        if (edad >= 18) {
            System.out.println("Es adulto");
        } else if (edad >= 13 && edad < 18) {
            System.out.println("Es adolescente");
        } else {
            System.out.println("Es niño");
        }
    }
}

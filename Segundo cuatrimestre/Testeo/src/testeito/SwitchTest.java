package testeito;



public class SwitchTest {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int edad = 24;
        
        switch(edad) {
            case 20: System.out.println("Tenes 20 años");
            break;
            case 21: System.out.println("Tenes 21 años");
            break;
            default: System.out.println("No tiene 20 ni 21 años");
        }
    }
}

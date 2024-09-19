package impresora;

public class Main {

    public static void main(String[] args) {
        Impresora imp = new Impresora();
        Documento doc = new Documento("Titulo de prueba", "Esto es un texto\nde prueba");
        
        imp.encender();
        
        try{
            imp.imprimir(doc);
        }
        catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}

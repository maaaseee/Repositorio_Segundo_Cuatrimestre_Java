package impresora;

import java.util.Scanner;

public class Impresora {
    private boolean estaEncendida;
    private String hoja;
    
    public Impresora(){
        
    }
    
    public void encender(){
        this.estaEncendida = true;
    }
    
    public void imprimir(Documento documento){
        if (!estaEncendida) {
            throw new RuntimeException("La impresora no está prendida.");
        }
        System.out.println(documento.getTitulo());
        System.out.println("---------------------------------");
        System.out.println(documento.getCuerpo());
    }
    
    public Documento getNewDocumento(){
        return new Documento("Sin titulo", "Sin cuerpo");
    }
    
    public void setHoja(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el tipo de hoja:");
        this.hoja = input.next();
    }
    
    public void documentOnTheFlight(){
        Documento d = new Documento("", "");
        imprimir(d);
    }
}

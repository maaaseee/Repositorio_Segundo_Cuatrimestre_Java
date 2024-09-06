package negocio;



public class Televisor {
    private static final int MAX_VOL = 100;
    private static final int MIN_VOL = 0;
    private static int nextNroSerie = 100;
    private final int NRO_SERIE;
    
    private String marca;
    private double medidas;
    private int canal;
    private int volumen;
    private boolean encendido;
    private String resolucion;
    
    public Televisor(String marca, double tamaño, String resolucion, int canal,
            int volume){
        this.marca = marca;
        this.medidas = tamaño;
        this.resolucion = resolucion;
        this.canal = canal;
        this.volumen = volume;
        this.NRO_SERIE = nextNroSerie++;
    }
    
    public void mostrarInfo(){
        System.out.println("Info Televisor"
                + "\n\nMarca: " + this.marca 
                + "\nResolucion: " + this.resolucion 
                + "\nMedidas: " + this.medidas
                + "\nCanal: " + this.canal + 
                "\nVolumen: " + this.volumen 
                + "\n" +
                ((this.encendido)?"Encendido":"Apagado"));
    }
    
    private void mostrarVolumen(){
        System.out.println("Volumen: " + this.volumen);
    }
    
    public void subirVolumen(){
        if (!this.encendido){
            System.out.println("El televisor esta apagado");
            return;
        }
        
        if (this.volumen <= MAX_VOL){
            this.volumen++;
            mostrarVolumen();
        }
        else {
            System.out.println("El volumen esta al maximo.");
        }
    }
    
    public void bajarVolumen(){
        if (!this.encendido){
            System.out.println("El televisor esta apagado");
            return;
        }
        
        if (this.volumen >= MIN_VOL){
            this.volumen--;
            mostrarVolumen();
        }
        else {
            System.out.println("El volumen esta al minimo.");
        }
    }
    
    public void power(){
        encendido = !encendido;
    }
}

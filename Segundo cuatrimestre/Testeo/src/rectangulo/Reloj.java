package rectangulo;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;
    
    private static final int MAX_HORAS = 24;
    private static final int MAX_MIN = 60;
    private static final int MAX_SEG = 60;
    
    public Reloj(int hora, int minutos, int segundos){
        this.horas = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public void cambiarHora(int hora){
        if (hora < MAX_HORAS && hora >= 0) {
            this.horas = hora;
        } else {
            System.out.println("Ese formato no existe.");
        }
    }
    
    public void cambiarMinutos(int min){
        if (min < MAX_MIN && min >= 0) {
            this.minutos = min;
        } else {
            System.out.println("Ese formato no existe.");
        }
    }
    
    public void cambiarSegundos(int seg){
        if (seg < MAX_SEG && seg >= 0) {
            this.segundos = seg;
        } else {
            System.out.println("Ese formato no existe.");
        }
    }
    
    public void mostrarHora(){
        String tiempoFormat = String.format("%02d:%02d:%02d", 
                this.horas, this.minutos, this.segundos);
        System.out.println(tiempoFormat);
    }
    
    private void pasarHora(){
        this.horas++;
    }
    private void pasarMin(){
        this.minutos++;
    }
    private void pasarSeg(){
        this.segundos++;
    }
    
    private void restartHora(){
        this.horas = 0;
    }
    private void restartMin(){
        this.minutos = 0;
    }
    private void restartSeg(){
        this.segundos = 0;
    }
    
    public void avanzarSegundo(){
        this.pasarSeg();
        if (this.segundos == MAX_SEG){
            this.pasarMin();
            this.restartSeg();
        }
        if (this.minutos == MAX_MIN){
            this.pasarHora();
            this.restartMin();
        }
        if (this.horas == MAX_HORAS) {
            this.restartHora();
        }
    }
}

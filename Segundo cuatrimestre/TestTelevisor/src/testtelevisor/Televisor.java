package testtelevisor;



public class Televisor {
    double medidas;
    String marca;
    int canal;
    int volumen;
    boolean encendido;
    String resolucion;
    
    public Televisor(String marc, double tamaño, String res, int channel,
            int volume, boolean state){
        marca = marc;
        medidas = tamaño;
        resolucion = res;
        canal = channel;
        volumen = volume;
        encendido = state;
    }
}

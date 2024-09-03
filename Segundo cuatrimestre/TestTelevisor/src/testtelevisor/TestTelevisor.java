package testtelevisor;

public class TestTelevisor {

    public static void main(String[] args) {
        Televisor tv1 = new Televisor("Samsung", 21.5, "FULLHD", 7, 18, true);
        Televisor tv2 = new Televisor("Sony", 60, "4K", 7, 18, true);
        Televisor tv3 = new Televisor("Sony", 60, "4K", 7, 18, true);
        
        //System.out.printf("Info televisor 1:\nMarca: %s\nResolucion: %S\nMedidas: %d"
        //        + "\nCanal: %d\nVolumen: %d\nEncendido");
        
        System.out.println("Info Televisor\n\nMarca: " + tv1.marca +
                "\nResolucion: " + tv1.resolucion + "\nMedidas: " + tv1.medidas
                + "\nCanal: " + tv1.canal + "\nVolumen: " + tv1.volumen + "\n" +
                ((tv1.encendido)?"Encendido":"Apagado"));
        
        System.out.println("Info Televisor\n\nMarca: " + tv2.marca +
                "\nResolucion: " + tv2.resolucion + "\nMedidas: " + tv2.medidas
                + "\nCanal: " + tv2.canal + "\nVolumen: " + tv2.volumen + "\n" +
                ((tv2.encendido)?"Encendido":"Apagado"));
        
        System.out.println("Info Televisor\n\nMarca: " + tv3.marca +
                "\nResolucion: " + tv3.resolucion + "\nMedidas: " + tv3.medidas
                + "\nCanal: " + tv3.canal + "\nVolumen: " + tv3.volumen + "\n" +
                ((tv3.encendido)?"Encendido":"Apagado"));
    }
}

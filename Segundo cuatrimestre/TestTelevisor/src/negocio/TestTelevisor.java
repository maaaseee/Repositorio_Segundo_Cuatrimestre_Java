package negocio;

public class TestTelevisor {

    public static void main(String[] args) {
        Televisor tv1 = new Televisor("Samsung", 21.5, "FULLHD", 7, 18);
        Televisor tv2 = new Televisor("Sony", 60, "4K", 11, 10);
        Televisor tv3 = new Televisor("Noblex", 70, "8k", 13, 25);
        
        tv1.mostrarInfo();
        tv1.power();
        
        System.out.println("-------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            tv1.subirVolumen(); 
        }
        
        tv1.mostrarInfo();
        
        /* System.out.println("Info Televisor\n\nMarca: " + tv2.marca +
        "\nResolucion: " + tv2.resolucion + "\nMedidas: " + tv2.medidas
        + "\nCanal: " + tv2.canal + "\nVolumen: " + tv2.volumen + "\n" +
        ((tv2.encendido)?"Encendido":"Apagado")); */


        
        int[] vector = new int[5];
    }
}

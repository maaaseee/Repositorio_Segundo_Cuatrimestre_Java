package herenciainterfaces;

public class Camion implements VehiculoCarga {

    private boolean encendido;
    private double carga;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Encendiendo el camion...");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Apagando el camion...");
    }

    @Override
    public void cargarCarga(double peso) {
        if (peso > 0) {
            carga += peso;
        }
    }

    @Override
    public double getCarga() {
        return carga;
    }

}

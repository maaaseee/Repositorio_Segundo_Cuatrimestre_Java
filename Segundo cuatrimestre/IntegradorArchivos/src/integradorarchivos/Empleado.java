package integradorarchivos;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private double sueldo;
    private Sector sector;

    public Empleado(int dni, String nombre, double sueldo, Sector sector) {
        super(dni, nombre);
        this.sueldo = sueldo;
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + ", sueldo=" + sueldo + ", sector=" + sector + '}';
    }

    public String toCSV() {
        return super.toCSV() + "," + sueldo + "," + sector;
    }

    public static Empleado fromCSV(String[] datos) {
        int dni = Integer.parseInt(datos[0]);
        String nombre = datos[1];
        double sueldo = Double.parseDouble(datos[2]);
        Sector sector = Sector.valueOf(datos[3].trim().toUpperCase());

        return new Empleado(dni, nombre, sueldo, sector);
    }

}

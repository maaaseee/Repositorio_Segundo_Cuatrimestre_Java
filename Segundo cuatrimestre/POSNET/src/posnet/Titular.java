package POSNET;

public class Titular {
    private String dni;
    private String nombre;
    private String apellido;
    private String numTelefono;
    private String mail;

    public Titular(String dni, String nombre, String apellido, String numTelefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numTelefono = numTelefono;
        this.mail = mail;
    }
    
    public String getNombreTitular(){
        return (this.nombre + " " + this.apellido);
    }
}

package empleado;

public class Desarrollador extends Empleado {
    String tecnologia;
    
    public Desarrollador(String nombre, double salario, String tecnologia){
        super(nombre, salario);
        this.tecnologia = tecnologia;
    }
    
    public String tecnologiaDesarrollador(){
        return this.tecnologia;
    }
}

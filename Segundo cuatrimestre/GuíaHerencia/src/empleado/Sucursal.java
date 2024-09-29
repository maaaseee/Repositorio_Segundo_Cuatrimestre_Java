package empleado;

public class Sucursal {

    public static void main(String[] args) {
        
        Gerente ger1 = new Gerente("Carlos", 800000);
        
        Desarrollador des1 = new Desarrollador("Federico", 400000, "Java");
        Desarrollador des2 = new Desarrollador("Marcelo", 500000, "Javascript");
        Desarrollador des3 = new Desarrollador("Fernando", 600000, "Python");
        Desarrollador des4 = new Desarrollador("Laura", 700000, "COBOL");
        
        ger1.ingresarEmpleadoCobijo(des1);
        ger1.ingresarEmpleadoCobijo(des2);
        ger1.ingresarEmpleadoCobijo(des3);
        ger1.ingresarEmpleadoCobijo(des4);
        
        System.out.println(ger1.cantidadEmpleadosACargo());
        
        System.out.println(des1.tecnologiaDesarrollador());
    }
    

}

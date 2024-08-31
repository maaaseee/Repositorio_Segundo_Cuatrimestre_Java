package instanciacionvariables;

/*
 ○ Crea una clase llamada Persona con los siguientes atributos: nombre (String) y edad (int).
 ○ Implementa un constructor que inicialice estos atributos.
 ○ Añade métodos para obtener y modificar los atributos (getters y setters).
 ○ En la clase Main, crea una instancia de Persona, utiliza sus métodos y verifica su
funcionamiento.
*/

public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String name, int age) {
        nombre = name;
        edad = age; 
    }
    
    public String getName() {
        return nombre;
    }
    
    public int getAge() {
        return edad;
    }
    
    public void changeName(String name) {
        nombre = name;
        System.out.println("Nombre cambiado a " + name);
    }
    
    public void changeAge (int age) {
        edad = age;
        System.out.println("Ahora " + nombre + " tiene " + age + " años");
    }
}

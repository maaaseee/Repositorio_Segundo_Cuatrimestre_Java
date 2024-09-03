package moodlepremium;
import java.util.Scanner; 



public class Estudiante {
    private String name;
    private String lastName;
    private int age;
    private String course;
    private double finalGrade;
    
    public Estudiante(String nombre, String apellido, int edad, 
            String curso, double calificacionFinal) {
        name = nombre;
        lastName = apellido;
        age = edad;
        course = curso;
        finalGrade = calificacionFinal;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + name + "\nApellido: " + lastName
        + "\nEdad: " + age + "\nCurso: " + course + "\nCalificaciòn: " + finalGrade);
    }
    
    public String getName() {
        return name;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getCourse() {
        return course;
    }
    
    public double getFinalGrade() {
        return finalGrade;
    }
    
    public void cambiarNombre(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        String nombre = scanner.nextLine();
        name = nombre;
    }
    
    public void cambiarApellido(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el apellido: ");
        String apellido = scanner.nextLine();
        lastName = apellido;
    }
    
    public void cambiarEdad(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la edad: ");
        int edad = scanner.nextInt();
        age = edad;
    }
    
    public void cambiarCurso(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el curso: ");
        String curso = scanner.nextLine();
        course = curso;
    }
    
    public void cambiarNota(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la nota: ");
        double nota = scanner.nextDouble();
        finalGrade = nota;
    }
}

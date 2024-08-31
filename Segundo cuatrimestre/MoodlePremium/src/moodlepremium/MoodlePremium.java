package moodlepremium;



public class MoodlePremium {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("David", "Hernandez", 20, "111-1", 6.5);
        
        // Getters
        System.out.println(estudiante1.getName());
        System.out.println(estudiante1.getLastName());
        System.out.println(estudiante1.getAge());
        System.out.println(estudiante1.getCourse());
        System.out.println(estudiante1.getFinalGrade());
        
        // Setters
        estudiante1.cambiarNombre();
        estudiante1.cambiarApellido();
        estudiante1.cambiarEdad();
        estudiante1.cambiarNota();
        estudiante1.cambiarCurso();
        
        estudiante1.mostrarInformacion();
    }
}

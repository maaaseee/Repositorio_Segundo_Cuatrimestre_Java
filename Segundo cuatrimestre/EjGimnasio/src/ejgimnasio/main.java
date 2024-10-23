package ejgimnasio;

public class main {

    public static void main(String[] args) {
        Gimnasio lionFitness = new Gimnasio("Lion Fitness");
        
        cargarGimnasio(lionFitness);
        
        lionFitness.mostrarSueldos();
        System.out.println("---------------------------------------");
        lionFitness.entrenadorConMasClientes().mostrarInfo();
    }

    public static void cargarGimnasio(Gimnasio gimnasio){
        EntrenadorEquipo equip = new EntrenadorEquipo(1423, "David", "Fernandez", 2017, 100000);
        EntrenadorEquipo equip1 = new EntrenadorEquipo(1443, "Alberto", "Fernandez", 2019, 200000);
        EntrenadorEquipo equip2 = new EntrenadorEquipo(1453, "Carolina", "Fernandez", 2022, 150000);
        
        PersonalTrainer perst = new PersonalTrainer(1654, "Carlos", "Romanez", 2020, 15, 30000);
        PersonalTrainer perst1 = new PersonalTrainer(1664, "Marcelo", "Machado", 2021, 10, 20000);
        PersonalTrainer perst2 = new PersonalTrainer(1654, "José", "Mocho", 2022, 20, 25000);
        
        gimnasio.agregarEntrenador(equip);
        gimnasio.agregarEntrenador(equip1);
        gimnasio.agregarEntrenador(equip2);
        
        gimnasio.agregarEntrenador(perst);
        gimnasio.agregarEntrenador(perst1);
        gimnasio.agregarEntrenador(perst2);
    }
}

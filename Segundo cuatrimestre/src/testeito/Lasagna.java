package testeito;



public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }
    public int remainingMinutesInOven(int timeInOven) {
        // int totalTime = new Lasagna().expectedMinutesInOven();
        int totalTime = expectedMinutesInOven();
        return totalTime - timeInOven;
    }
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    public int totalTimeInMinutes(int layers, int timeInOven) {
        /*Lasagna lasagna = new Lasagna();
          int layersTime = lasagna.preparationTimeInMinutes(layers); */
        int layersTime = preparationTimeInMinutes(layers);
        return timeInOven + layersTime;
    }
    
    public static void main(String[] args) {
        // Crear una instancia de la clase Lasagna
        Lasagna lasagna = new Lasagna();

        // Llamar a los métodos y almacenar sus resultados
        int expectedTime = lasagna.expectedMinutesInOven();
        int remainingTime = lasagna.remainingMinutesInOven(30);
        int prepTime = lasagna.preparationTimeInMinutes(3);
        int totalTime = lasagna.totalTimeInMinutes(3, 30); 

        // Imprimir los resultados
        System.out.println("Tiempo esperado en el horno: " + expectedTime + " minutos");
        System.out.println("Tiempo restante en el horno: " + remainingTime + " minutos");
        System.out.println("Tiempo de preparación: " + prepTime + " minutos");
        System.out.println("Tiempo total de cocción: " + totalTime + " minutos");
    }
}



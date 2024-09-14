package auto;

import java.util.ArrayList;

public class Estacionamiento {

    private ArrayList<Auto> cars;

    public Estacionamiento(){
        this.cars = new ArrayList<>();
    }
    
    public void estacionarAuto(Auto auto){
        if (auto == null) {
            throw new NullPointerException();
        }
        this.cars.add(auto);
    }
    
    public void listarAutos(){
        // For each
        for( Auto a: this.cars){
            System.out.println(a);
        }
    }
    
    public int cantidadAutos(){
        return this.cars.size();
    }
}
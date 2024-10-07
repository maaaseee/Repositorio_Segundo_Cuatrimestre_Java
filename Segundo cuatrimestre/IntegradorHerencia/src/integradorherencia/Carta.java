package integradorherencia;

public abstract class Carta {
    private boolean visible;
    
    public void voltear(){
        this.visible = !this.visible;
        System.out.println("Volteando la carta. Ahora está: " + (this.visible ? "Boca arriba" : "Boca abajo"));
    }
    
    public abstract String getFrente();
    
    public void mostrar(){
        if (visible) {
            System.out.println(getFrente());
        } else {
            System.out.println("****###***###****");
        }
    }
}

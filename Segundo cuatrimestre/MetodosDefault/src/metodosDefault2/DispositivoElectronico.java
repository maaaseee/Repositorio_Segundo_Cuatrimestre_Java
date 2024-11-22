package metodosDefault2;

public abstract class DispositivoElectronico{
    private String marca;
    
    public DispositivoElectronico(String marca) {
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void reiniciar() {
        System.out.println("Reiniciando...");
    }
}

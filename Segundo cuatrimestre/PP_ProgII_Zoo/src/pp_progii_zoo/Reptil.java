package pp_progii_zoo;

public class Reptil extends Animal {
    
    private String tipoEscama;
    private String regTemperatura;

    public Reptil(String nombre, int edad, String tipoEscama, String regTemperatura) {
        super(nombre, edad);
        this.tipoEscama = tipoEscama;
        this.regTemperatura = regTemperatura;
    }
    
    @Override
    public String toString() {
        return "Reptil: [" + super.toString() + ", Tipo de escama: " + tipoEscama + ", Regulación de temperatura: " + regTemperatura + "]";
    }
}

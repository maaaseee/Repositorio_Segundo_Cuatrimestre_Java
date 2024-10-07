package empleado;

public enum Lenguajes {
    JAVA ("Interpretado", 1),
    PYTHON ("Híbrido", 2),
    JAVASCRIPT ("Híbrido" , 2),
    CSHARP ("Interpretado", 3),
    HTML ("Marcado", 3);
    
    private String tipo;
    private int cuatri;

    private Lenguajes(String tipo, int cuatri) {
        this.tipo = tipo;
        this.cuatri = cuatri;
    }
    
    public int getCuatrimestre(){
        return cuatri;
    }
    
    public String getTipo(){
        return tipo;
    }

    @Override
    public String toString() {
        String nombre = super.toString();
        
        return nombre.substring(0, 1) + nombre.substring(1).toLowerCase();
    }
    
    
}

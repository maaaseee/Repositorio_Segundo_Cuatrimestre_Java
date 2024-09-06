package rectangulo;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaActual;
    
    public Libro(String titulo, String autor, int numeroDePaginas,
            int paginaActual){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaActual = paginaActual;
    }
    
    public void mostrarLibro(){
        System.out.println("Pagina actual: " + this.paginaActual 
                + "\nTotal de paginas: " + this.numeroDePaginas);
    }
    
    public void pasarPagina(){
        if (this.paginaActual < numeroDePaginas){
            this.paginaActual++;
        }
        else {
            System.out.println("Ya estas en la ultima pagina.");
        }
    }
    
    public void retrocederPagina(){
        if (this.paginaActual > 1){
            this.paginaActual--;
        }
        else {
            System.out.println("Ya estas en la primer pagina");
        }
    }
    
    public void finalizado(){
        if (this.paginaActual == numeroDePaginas) {
            System.out.println("Has finalizado el libro.");
        }
    }
}

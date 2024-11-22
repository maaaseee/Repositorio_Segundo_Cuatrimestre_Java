package almacen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class main {

    public static void main(String[] args) {
        //Almacen<String> almacen = new Almacen<>();
        Almacen<Producto> almacenProd = new Almacen<>();
        
        /*
        almacen.agregar("Marcelo");
        almacen.agregar("Pepe");
        almacen.agregar("Fernando");
        almacen.agregar("Luis");
        almacen.agregar("Gustavo");
        
        System.out.println(almacen.tamanio());
        */
        almacenProd.agregar(new Producto(13350, "ACME", 1500.45, Tipo.ELECTRONICO));
        almacenProd.agregar(new Producto(12346, "La Serenisima", 500.99, Tipo.COMESTIBLE));
        almacenProd.agregar(new Producto(12347, "Ala", 2000.95, Tipo.LIMPIEZA));
        almacenProd.agregar(new Producto(12348, "Genérica", 500.99, Tipo.LIMPIEZA));
        almacenProd.agregar(new Producto(12449, "Phillips", 5000.99, Tipo.ELECTRONICO));
        almacenProd.agregar(new Producto(12450, "Samsung", 5500.99, Tipo.ELECTRONICO));
        almacenProd.agregar(new Producto(12345, "Ilolay", 129.99, Tipo.COMESTIBLE));
        almacenProd.agregar(new Producto(14351, "Nescafé", 449.99, Tipo.COMESTIBLE));
        almacenProd.agregar(new Producto(15424, "Camel", 209.99, Tipo.COMESTIBLE));
        
        
        /*
        mostrarContenido(almacenProd);
        
        Comparator<Producto> compNombreAsc = (Producto p1, Producto p2) -> {
            return p1.getMarca().compareTo(p2.getMarca());
        };
        
        System.out.println("-".repeat(50));
        
        mostrarContenido(almacenProd, compNombreAsc);
        
        
        almacenProd.forEach(p->System.out.println(p));
        almacenProd.forEach(System.out::println);
        
        
        Iterator<Producto> it = almacenProd.iterator();
        
        while(it.hasNext()) {
            System.out.println(it.next());
        }*/
        
        GestorAlmacen.mostrarContenido(almacenProd);
        
        System.out.println("-".repeat(90));
        GestorAlmacen.mostrarContenidoOrdenado(almacenProd, (Producto p1, Producto p2) -> {
            return p1.getMarca().compareTo(p2.getMarca());
        });
        
        System.out.println("-".repeat(90));
        List<Producto> electronicos = GestorAlmacen.filtrarAlmacen(almacenProd, p -> p.getTipo().equals(Tipo.ELECTRONICO));
        electronicos.forEach(System.out::println);
        
        System.out.println("-".repeat(90));
        GestorAlmacen.buscarElementos(almacenProd, p -> {
            if (p.getPrecio() > 1000) {
                System.out.println(p);
            }
        });
        
        System.out.println("-".repeat(90));
        GestorAlmacen.transformarAlmacen(almacenProd, (Producto p) -> {
            if (p.equals(Tipo.COMESTIBLE)) {
                p.setPrecio(10);
            }
            return p;
        });
    }
}

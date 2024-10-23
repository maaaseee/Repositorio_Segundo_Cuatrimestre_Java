package sistemademercancia;

import java.util.List;

public class ModeloDeParcial1 {

    public static void main(String[] args) {
        Sistema coto = new Sistema(5);

        System.out.println("Punto 1\n");
        cargarSistemaPunto1(coto);

        System.out.println("Punto 2\n");
        
        cargarSistemaPunto2(coto);

        System.out.println("Punto 3\n");
        
        cargarSistemaPunto3(coto);
        
        System.out.println("Punto 4\n");
        
        List<Mercancia> listaDeOfertas = coto.traerMercancia(true);
        for (Mercancia merc : listaDeOfertas) {
            System.out.println(merc);
        }
    }

    public static void cargarSistemaPunto1(Sistema sist) {
        System.out.println("1-1");
        try {
            sist.agregarServicio("897323", "Mantenimiento máquina de cortar pasto", 2500.0, 15.0, true);
        } catch (LenCodMercanciaException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("1-2");
        sist.agregarServicio("8973231", "Mantenimiento máquina de cortar pasto", 2500.0, 15.0, true);
        System.out.println(sist.traerMercancia("8973231"));

        System.out.println("1-3");
        try {
            sist.agregarProducto("432597", "Manguera de desagote lavarropa", 650.0, 15.0, true);
        } catch (LenCodMercanciaException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("1-4");
        sist.agregarProducto("4325971", "Manguera de desagote lavarropa", 650.0, 15.0, true);
        System.out.println(sist.traerMercancia("4325971"));
        
        System.out.println("");
    }

    public static void cargarSistemaPunto2(Sistema sist) {
        System.out.println("2-1");
        System.out.println(sist.traerMercancia("8973231").calcularPrecioFinal());
        
        System.out.println("2-2");
        System.out.println(sist.traerMercancia("4325971").calcularPrecioFinal());
        
        System.out.println("");
    }
    
    public static void cargarSistemaPunto3(Sistema sist) {
        System.out.println("3-1");
        sist.agregarProducto("3892871", "Aceite para máquinas", 430.0, 10.0, true);
        sist.agregarServicio("3892815", "Mantenimiento de cortadora de césped", 2520.0, 0, true);
        sist.agregarProducto("9381925", "Tambor lavarropa", 7500.0, 25.0, false);
        sist.agregarServicio("3481759", "Mantenimiento estufa", 1250.0, 0, false);
        System.out.println(sist.traerMercancia("3892871"));
        System.out.println(sist.traerMercancia("3892815"));
        System.out.println(sist.traerMercancia("9381925"));
        System.out.println(sist.traerMercancia("3481759"));
        
        System.out.println("3-2");
        try {
            sist.agregarServicio("3892815", "Mantenimiento de cortadora de césped", 2520.0, 0, true);
        } catch (CodYaExistenteException e) {
            System.err.println(e.getMessage());
        }
        
        System.out.println("3-3");
        try {
            sist.agregarProducto("9381925", "Tambor lavarropa", 7500.0, 25.0, false);
        } catch (CodYaExistenteException e) {
            System.err.println(e.getMessage());
        }
        
        System.out.println("");
    }
}

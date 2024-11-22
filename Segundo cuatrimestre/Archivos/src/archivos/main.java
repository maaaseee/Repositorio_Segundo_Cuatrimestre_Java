package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File archivo = new File("src/resources/archivo.txt");
        System.out.println(archivo.exists());

        try {
            archivo.createNewFile();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        if (archivo.exists()) {
            System.out.println("Archivo encontrado!");
            System.out.println(archivo.getName());
            System.out.println(archivo.getAbsolutePath());
            //System.out.println(archivo.delete());
            System.out.println(archivo.getParent());
        } else {
            System.out.println("No existe el archivo.");
        }

        try (BufferedReader parser = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = parser.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

        System.out.println("");
        // Borrando el archivo
        System.out.println(archivo.exists());

        // ------------------------------------------------------------------------------------------------ //
        File manuscrito = new File("src/resources/manuscrito.txt");
        
        try (BufferedWriter thoth = new BufferedWriter(new FileWriter(manuscrito))) {

            if (manuscrito.exists()) {
                System.out.println("El manuscrito ya existe.");
            } else {
                manuscrito.createNewFile();
                System.out.println("Se ha creado el manuscrito.");
            }

            thoth.write("Hola buenos dias, esta es la primer línea,\n");
            thoth.write("Esta es la segunda linea,\n");
            thoth.write("Y esta es la ultima linea.");

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        // ------------------------------------------------------------------------------------------------ //
        
        Mago mago = new Mago("Gandalf", 100);
        
        String path = "src/resources/mago.bin";
        
        // tambien puede ser .dat
        try(FileOutputStream binario = new FileOutputStream(path);
            ObjectOutputStream salida = new ObjectOutputStream(binario)) {
            
            salida.writeObject(mago);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        Mago magoRecuperado = null;
        
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(path))) {
            magoRecuperado = (Mago) input.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
    }

}

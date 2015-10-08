package EJ3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class EJ3AD2 {

    static FileOutputStream out;
    static FileInputStream in;
    static File tex2 = new File("/home/oracle/Desktop/Pruebas/foto2.jpg");

    public static void main(String[] args) {
        do {
            if (tex2.exists()) {
                System.out.println("El directorio ya existe");
            } else {
                try {
                    System.out.println("Creando directorio...");
                    System.out.println(tex2.createNewFile());
                } catch (IOException ex) {
                    System.out.println("Error creando fichero");
                }
            }
        } while (tex2.exists() == false);

        try {
            out = new FileOutputStream(tex2,true);
            in = new FileInputStream("/home/oracle/Desktop/Pruebas/foto.jpg");
            int lec;
            while ((lec = in.read()) != -1) {
                out.write((char)lec);
            }
            in.close();
            out.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error, No se encuentra el fichero");
        } catch (IOException ex) {
            System.out.println("Error leyendo fichero");
        }
    }
}
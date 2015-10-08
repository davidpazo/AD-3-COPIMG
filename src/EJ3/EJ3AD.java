package EJ3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class EJ3AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
            BufferedInputStream entrada = new BufferedInputStream(new FileInputStream("/home/oracle/Desktop/Pruebas/foto.jpg"));
            BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream("/home/oracle/Desktop/Pruebas/foto2.jpg"));
            int image;
            do {
                image = entrada.read();
                if (image != -1) {
                    salida.write(image);
                }
            } while (image != -1);
            entrada.close();
            salida.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error ");
        }
    }

}


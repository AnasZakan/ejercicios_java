package ficherostexto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
* Ejemplo de uso de la clase File Lectura de un fichero de texto
*
* @author Anas Zakan
*/
public class EjemploFichero08 {
	public static void main(String[] args) {
		try {
		BufferedReader br1 = new BufferedReader(new
		FileReader("c:\\prueba\\fichero1.txt"));
		BufferedReader br2 = new BufferedReader(new
		FileReader("c:\\prueba\\fichero2.txt"));
		BufferedReader br3 = new BufferedReader(new
		FileReader("c:\\prueba\\mezcla.txt"));
		String linea = "";
		System.out.println("Contenido del fichero fichero1.txt:");
		while ((linea = br1.readLine()) != null) {
		System.out.println(linea);
		}
		System.out.println("Contenido del fichero fichero2.txt:");
		while ((linea = br2.readLine()) != null) {
		System.out.println(linea);
		}
		System.out.println("Contenido del fichero mezcla.txt:");
		while ((linea = br3.readLine()) != null) {
		System.out.println(linea);
		}
		br1.close();
		br2.close();
		br3.close();
		} catch (IOException ioe) {
		System.out.println("Se ha producido un error de lectura");
		System.err.println(ioe.getMessage());
		}
		}
}

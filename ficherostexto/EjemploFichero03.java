package ficherostexto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
* Ejemplo de uso de la clase File Escritura en un fichero de texto
*
* @author Anas Zakan
*/
public class EjemploFichero03 {
	public static void main(String[] args) {
		try {
		BufferedWriter bw = new BufferedWriter(new
		FileWriter("c:\\prueba\\clientes.txt"));
		//no añade, pisa el fichero con los datos que se metan si se ejecuta de nuevo
		bw.write("Alberto\n");
		bw.write("Eva\n");
		bw.write("Laura\n");
		bw.write("Antonio\n");
		System.out.println("Fichero creado");
		bw.close();
		} catch (IOException ioe) {
		System.out.println("No se ha podido escribir en el fichero");
		}
		}
}

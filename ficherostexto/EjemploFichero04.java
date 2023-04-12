package ficherostexto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
* Ejemplo de uso de la clase File Lectura de un fichero de texto
* Muestra por pantalla el contenido del fichero "asignatura.txt"
*/
public class EjemploFichero04 {
	public static void main(String[] args) {
		try {
		BufferedReader br = new BufferedReader(new
		FileReader("asignatura.txt"));
		String linea = "";
		System.out.println("Asignaturas de 1º de DAM:");
		while (linea != null) {
		linea = br.readLine();
		if (linea != null) {
		System.out.println(linea);
		}
		}
		br.close();
		} catch (IOException ioe) {
			// qué hacer si hay un error en la lectura del fichero
		System.out.println("No se puede leer el fichero asignatura.txt");
		}
		}
}

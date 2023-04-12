package ficherostexto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
* Ejemplo de uso de la clase File Escritura en un fichero de texto
* Genera un fichero llamado "pares.txt" y guarda los números pares del 1 al 100
*/

public class EjemploFichero05 {
	public static void main(String[] args) {
		try {
		BufferedWriter bw = new BufferedWriter(new
		FileWriter("c:\\prueba\\pares.txt"));
		int count = 0;
		for (int i = 2; i <= 100; i += 2) {
		bw.write(Integer.toString(i) + "\n");
		count++;
		}
		bw.close();
		System.out.println("Se ha creado el fichero 'pares.txt'");
		System.out.println("Se han guardado " + count + " números pares");
		} catch (IOException ioe) {
		System.out.println("No se ha podido escribir en el fichero");
		}
		}
	
}

package ficherostexto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
* Ejemplo de uso de la clase File Mezcla de dos ficheros
*
* @author Anas Zakan
*/
public class EjemploFichero09 {
	public static void main(String[] args) {
		try {
		BufferedReader br1 = new BufferedReader(new
		FileReader("c:\\prueba\\pais.txt"));
		BufferedReader br2 = new BufferedReader(new
		FileReader("c:\\prueba\\capitale.txt"));
		BufferedWriter bw = new BufferedWriter(new
		FileWriter("c:\\prueba\\LosPais.txt"));
		String linea1 = "";
		String linea2 = "";
		while ( (linea1 != null) || (linea2 != null) ) {
		linea1 = br1.readLine();
		linea2 = br2.readLine();
		if (linea1 != null) {
		bw.write(linea1 + "\n");
		}
		if (linea2 != null) {
		bw.write(linea2 + "\n");
		}
		}
		br1.close();
		br2.close();
		bw.close();
		System.out.println("Archivo LosPais.txt creado satisfactoriamente.");
		} catch (IOException ioe) {
		System.out.println("Se ha producido un error de lectura/escritura");
		System.err.println(ioe.getMessage());
		}
}
}

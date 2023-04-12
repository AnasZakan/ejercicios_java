package ficherostexto;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class CrearArchivoAsignatura {
public static void main(String[]args) {
	try {
		BufferedWriter bw = new BufferedWriter(new
				FileWriter("C:\\prueba\\asignatura.txt"));
				 bw.write("Programación\n");
				 bw.write("Bases de datos\n");
				 bw.write("Entornos de desarrollo\n");
				 bw.write("Lenguajes de marcas\n");
				 bw.write("Sistemas informáticos\n");
				 bw.close();
				 System.out.println("El archivo ha sido creado correctamente");
				 } catch (IOException e) {
				 System.out.println("Error al crear el archivo: " + e.getMessage());
	}
}
}

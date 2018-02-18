package Ejercicios;
import java.io.*;
public class Ejer11_ManejoDeArchivo {
	public static void main(String[] args) throws IOException {
		String text="Para archivo";
		try {
			FileReader fr = new FileReader("archivo.txt");
			BufferedReader bf = new BufferedReader(fr);
			System.out.println(bf.readLine());
			PrintWriter pw = new PrintWriter("archivo.txt");
			pw.println(text);
			pw.close();
			System.out.println(bf.readLine());bf.close();
		}catch(FileNotFoundException e) {
			System.out.print(e.getMessage());
		}
		
	}
}

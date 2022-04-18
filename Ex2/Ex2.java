package Ex2;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Ex2 {
	
	public void copie(String filenameFrom, String filenameTo) throws IOException {
		File f1 = new File(filenameFrom);
		Reader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr); // Pour lire ligne par ligne
		
		File f2 = new File(filenameTo);
		Writer fw  =new FileWriter(f2);
		BufferedWriter bw= new BufferedWriter(fw);
		String c;
		
		while( (c=br.readLine()) != null) {
			bw.write(c +"\n");  // pour quand il ecrit ligne doit sauté pour ecrire la deusieme
		}
		fr.close();
		fw.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Ex2 e = new Ex2();
		e.copie("notes.txt", "copie.txt");
	}
	
	
	

}

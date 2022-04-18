package Youss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	
	// Copier le fichier test.txt vers copie.txt
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f1 = new File("notes.txt");
		FileReader fr = new FileReader(f1);  // Pour lire le fichier
		File f2 = new File("copie.txt");
		FileWriter fw = new FileWriter(f2);  // Pour ecrire
		// Pour parcourir
		int c;
		while((c=fr.read()) != -1) {
			fw.write(c);
		}
		fw.close();
		fr.close();
		

	}
	

}

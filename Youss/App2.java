package Youss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
	
    // Traitement ligne par ligne
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("notes.txt");
		FileReader fr = new FileReader(f1); 
		BufferedReader br = new BufferedReader(fr); // lire ligne par ligne
		String s;
		float somme=0; int nb=0;
		while((s=br.readLine()) != null) {
			++nb;
			String[] t = s.split(";"); // separer les colonnes avec ";"
		//	System.err.println(t[2]);
			float note = Float.parseFloat(t[2]);  // convert String vers float
			somme = somme+note;  //calculer la somme des notes
		}
		System.out.println("Somme des notes = "+somme);
		System.out.println("Moyenne des notes = "+somme/nb);
	}
		
	
}

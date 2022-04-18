package Youss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreerEtudiantDansFile {
	
	// Enregistrer des objets
	// Remplire file par des objets etudiants
	public static void main(String[] args) throws IOException {
		Etudiant e1 = new Etudiant("E1", "math", 12);
		Etudiant e2 = new Etudiant("E2", "math", 15);
		File f =new File("Etudiants.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos); // pour ecrire des objets
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.close();
		
	}
	
	
	

}

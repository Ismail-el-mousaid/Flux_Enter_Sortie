package Youss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LireEtudiantsApartirFile {
	
	//Lire des objets
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("Etudiants.txt");
		FileInputStream fis= new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Etudiant e1 = (Etudiant) ois.readObject();
		Etudiant e2 = (Etudiant) ois.readObject();
		System.out.println(e1);
		System.out.println(e2);
	}

}

package Youss;

import java.io.File;

public class FileClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Parcourir le contenu du c:/ 
		File f = new File("c:/");
		String[] contenu = f.list(); // retourne le contenu et le stocker dans tableau
		for(String s:contenu) {
			File f2 = new File("c:/"+s);
			if(f2.isDirectory())
				System.out.println(s +": est un repertoire");
			else
				System.out.println("File :"+s+" sa taille= "+f2.length());
			//System.out.println(s);
		}
	}

}

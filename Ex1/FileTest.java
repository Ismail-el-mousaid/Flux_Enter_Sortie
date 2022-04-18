package Ex1;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public void testFile (String path) throws IOException {
		File f = new File(path);
		if(f.exists()) {
			System.out.println(path + "le fichier existe est il s'agit d'un " + (f.isFile() ? "fichier" : "repertoire"));
			String[] contenu = f.list();
			for(String s: contenu) {
				File f2 = new File(s);
				if(f2.isDirectory()) {
					System.out.println("Repertoire :" +f2);
				}
				else {
					System.out.println("Fichier :" +f2+ " chemin: " +f2.getAbsolutePath());
				}
			}
		} else {
			f.createNewFile();
		}
			
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileTest f = new FileTest();
		f.testFile("C:\\");
	}
	
}

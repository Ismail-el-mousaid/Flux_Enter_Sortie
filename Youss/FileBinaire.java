package Youss;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileBinaire {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("f.doc");
		FileInputStream fis = new FileInputStream(f1); //lire file binaire
		BufferedInputStream bis = new BufferedInputStream(fis);  // il lire la totalité des octets
		
		File f2 = new File("f.zip");
		FileOutputStream fos = new FileOutputStream(f2); // Pour ecrire
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ZipOutputStream zos = new ZipOutputStream(bos); // Pour compresser
		
		zos.setMethod(ZipOutputStream.DEFLATED); //spécifier la methode de compression : Standard
		zos.putNextEntry(new ZipEntry(f1.getName()));
		
		int c;
		while((c=bis.read()) != -1) {  // lecture
			zos.write(c);               // ecriture
		}
		zos.close();

	}

}

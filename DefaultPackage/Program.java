import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Reader fr = new java.io.FileReader("notes.txt");
		
		int c ;
		while(( c = fr.read()) != -1) {
			System.out.println((char)c); // si on n'utilise pas (char) il affche code asci
		}
		
		
		fr.close();
		
		// Copie une fichier a une autre
		
		/*char[] ch = new char[50];
		int cnt = fr.read(ch,5,8);
		System.out.println(cnt);
		System.out.println(ch);*/
		
		/*InputStream fis =new FileInputStream("test.txt");
		byte[] ch = new byte[50];
		int cnt = fis.read(ch,5,8);
		System.out.println(cnt);
		System.out.println(ch);*/
		fr.close();
		InputStream entrer = new FileInputStream("test.txt");
		OutputStream sortie = new FileOutputStream("sortie.txt");
		int cc;
		while ((cc=entrer.read())!=-1) {
			sortie.write(cc);
		}
		
		
	}

}

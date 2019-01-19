import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;;

public class MainFichier {

	public static void main(String[] args) {

		// Creation d'un fichier :

		File fichier = new File("D:\\Dossiers\\JavaJEE\\YouTube\\doc.txt");

		if (!fichier.exists()) { // Si le fichier n'existe pas , on veut le creer !!
			try {
				fichier.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else { // Si le fichier existe, on veut ecrire dedans ??
			try {
				FileWriter ecrire = new FileWriter(fichier);
				BufferedWriter bw = new BufferedWriter(ecrire); // Buffer = memoire tempons pour interagir avec un
																// fichier (lire, ecrir, ...)
				bw.write("J'ecri dans ce fichier a partir d'un programme JAVA =) ");
				bw.newLine();
				bw.write("Et voila une deuxieme ligne =D ");
				bw.newLine();
				bw.close();
				ecrire.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		File index = new File("D:\\Dossiers\\JavaJEE\\YouTube\\index.html");

		List<String> htmlLine = Arrays.asList("<html>", "<head>", "<title> Mon 1er HTML depuis JAVA </title>",
				"<body>", "<p> J'ai genere ce corp HTML par le biais d'un programme JAVA realise avec eclispe. </p>",
				"</body>", "</head>", "</html>");

		if (!index.exists()) {
			try {
				index.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {

			try {
				FileWriter w = new FileWriter(index);
				BufferedWriter bw = new BufferedWriter(w);

				for (String line : htmlLine) {
					bw.write(line);
					bw.newLine();
					//System.out.println(line);
				}
				bw.close();
				w.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		// Lire un fichier :
		
		if(!index.exists()) {
			try {
				index.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			try {
				BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(index), "UTF-8"));
				String line = r.readLine();
				while(line != null) {
					System.out.println(line);
					line = r.readLine();
				}
				r.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

		// Creation d'un dossier :

		File dossier = new File("D:\\Dossiers\\JavaJEE\\YouTube\\dossier\\");

		if (!dossier.exists()) { // Si le dossier n'existe pas ??
			dossier.mkdir();
		}
		
		//Deplacement d'un fichier d'un dossier vers un autre :
		
		File source = new File("D:\\Dossiers\\JavaJEE\\YouTube\\index.html");
		File dest = new File("D:\\Dossiers\\JavaJEE\\YouTube\\dossier\\"+source.getName());
		try {
			Files.copy(source.toPath(), dest.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		source.delete();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}

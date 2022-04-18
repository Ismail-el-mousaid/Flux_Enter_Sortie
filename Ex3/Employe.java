package Ex3;

import java.util.Date;


public class Employe {
	String nom, prenom, genre;
	Date dateNaissance, dateEmbauche;
	
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getGenre() {
		return genre;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public Employe(String nom, String prenom, String genre, Date dateNaissance, Date dateEmbauche) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.dateNaissance = dateNaissance;
		this.dateEmbauche = dateEmbauche;
	}
	public Employe() {
		super();
	}
	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", genre=" + genre + ", dateNaissance=" + dateNaissance
				+ ", dateEmbauche=" + dateEmbauche + "]";
	}
	
	
}

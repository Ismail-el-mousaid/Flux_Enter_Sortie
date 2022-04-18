package Youss;

import java.io.Serializable;

public class Etudiant implements Serializable{
	private String code, matiere;
	private float note;
	
	
	public String getCode() {
		return code;
	}
	public String getMatiere() {
		return matiere;
	}
	public float getNote() {
		return note;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public Etudiant(String code, String matiere, float note) {
		super();
		this.code = code;
		this.matiere = matiere;
		this.note = note;
	}
	public Etudiant() {
		super();
	}
	@Override
	public String toString() {
		return "Etudiant [code=" + code + ", matiere=" + matiere + ", note=" + note + "]";
	}
	
	

}

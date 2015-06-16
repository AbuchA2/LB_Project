package modele;

import java.util.Date;

public class Client {
	
	private int id ;
	private String nom ;
	private String nom_de_jeune_fille ;
	private String prenom ;
	private String date_de_naissance ;
	private String adresse ;
	private String user_mail ;
	private String tel ;
	private String canal ;
	private String produits_choisis ;
	private String lien_PI ;
	private String lien_JD ;
	private String lien_IS ;
	private int user_id ;
	
	
	public String getCanal() {
		return canal;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom_de_jeune_fille() {
		return nom_de_jeune_fille;
	}
	public void setNom_de_jeune_fille(String nom_de_jeune_fille) {
		this.nom_de_jeune_fille = nom_de_jeune_fille;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate_de_naissance() {
		return date_de_naissance;
	}
	public void setDate_de_naissance(String datedenaissance) {
		this.date_de_naissance = datedenaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getProduits_choisis() {
		return produits_choisis;
	}
	public void setProduits_choisis(String produits_choisis) {
		this.produits_choisis = produits_choisis;
	}
	public String getLien_PI() {
		return lien_PI;
	}
	public void setLien_PI(String lien_PI) {
		this.lien_PI = lien_PI;
	}
	public String getLien_JD() {
		return lien_JD;
	}
	public void setLien_JD(String lien_JD) {
		this.lien_JD = lien_JD;
	}
	public String getLien_IS() {
		return lien_IS;
	}
	public void setLien_IS(String lien_IS) {
		this.lien_IS = lien_IS;
	}
	
	

}

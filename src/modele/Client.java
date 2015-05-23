package modele;

import java.sql.Date;

public class Client {
	
	private int id ;
	private String nom ;
	private String nom_de_jeune_fille ;
	private String prenom ;
	private Date date_de_naissance ;
	private String adresse ;
	private String user_mail ;
	private String tel ;
	private int canal ;
	private int produits_choisis ;
	private String lien_PI ;
	private String lien_JD ;
	private String lien_IS ;
	
	
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
	public Date getDate_de_naissance() {
		return date_de_naissance;
	}
	public void setDate_de_naissance(Date date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
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
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getProduits_choisis() {
		return produits_choisis;
	}
	public void setProduits_choisis(int produits_choisis) {
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

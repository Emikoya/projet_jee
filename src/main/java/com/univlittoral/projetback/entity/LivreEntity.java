package com.univlittoral.projetback.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.univlittoral.projetback.enums.GenreEnum;

@Entity // => Pour que votre application Spring boot sache que cette classe est une entité
@Table(name="livres") //=> le nom de la table de votre base de données associée à cet objet Entité.

public class LivreEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private Integer id;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="editeur")
	private String editeur;
	
	@Column(name="NBpage")
	private int NBpage;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="lieu")
	private String lieu;
	
	@Column(name="genre")
	@Enumerated(EnumType.STRING)
	private GenreEnum genre;
	
	@Column(name="auteur")
	private String auteur;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public int getNBpage() {
		return NBpage;
	}
	public void setNBpage(int nBpage) {
		NBpage = nBpage;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public GenreEnum getGenre() {
		return genre;
	}
	public void setGenre(GenreEnum genre) {
		this.genre = genre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}

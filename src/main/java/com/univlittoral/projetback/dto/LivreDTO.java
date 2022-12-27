package com.univlittoral.projetback.dto;

import java.sql.Date;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.univlittoral.projetback.enums.GenreEnum;

public class LivreDTO {
	private Integer id;
	private String nom;
	private String editeur;
	private int NBpage;
	private Date date;
	private String lieu;
	@Enumerated(EnumType.STRING)
	private GenreEnum genre;
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

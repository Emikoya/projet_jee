package com.univlittoral.projetback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.projetback.entity.AuteurEntity;
import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.repository.AuteurRepository;
import com.univlittoral.projetback.repository.LivreRepository;

@Service
public class LivreService {

	@Autowired
	private LivreRepository repo; 
	private AuteurRepository repo_auteur;
	
	//Afficher tous les livres
	public List<LivreEntity> findLivre(){
		return repo.findAll();
	}
	
	//Afficher les détails d'un livre
	public LivreEntity findById(Integer id) {
		return repo.findById(id).orElse(null);
	}
	
	//Supprimer un livre
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}
	
	//Ajouter et Modifier un livre
	public void postLivre(LivreEntity newlivre) {
		repo.save(newlivre);
	}
	
	//Afficher tous les auteurs
	public List<AuteurEntity> findAuteur(){
		return repo_auteur.findAll();
	}
	
	//Afficher les détails d'un auteurs
	public AuteurEntity findAuteurById(Integer id) {
		return repo_auteur.findById(id).orElse(null);
	}
}

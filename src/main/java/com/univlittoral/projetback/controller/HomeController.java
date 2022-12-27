package com.univlittoral.projetback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.dto.HomeDTO;
import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.entity.LivreEntity;
import com.univlittoral.projetback.mapper.AuteurMapper;
import com.univlittoral.projetback.mapper.LivreMapper;
import com.univlittoral.projetback.service.LivreService;


@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "/rest/bd") //=> l’URL d’accès à votre controller.
public class HomeController {

	@Autowired
	private LivreService service;
	
	@GetMapping(value="/home")
	public HomeDTO getHome(){
		HomeDTO home = new HomeDTO();
		home.setLivres(LivreMapper.map(service.findLivre()));
		
		return home;
	}
	
	//Afficher les détails d'un livre
	@GetMapping(value="/livres/{id}")
	public LivreDTO findById(@PathVariable Integer id) {
		return LivreMapper.map(service.findById(id));
	}
	
	//Supprimer un livre
	@DeleteMapping(value="/livres/{id}")
	public void deleteById(@PathVariable Integer id) {
		service.deleteById(id);
	}
	
	//Ajouter un livre
	@PostMapping(value="/livres")
	public void postLivre(@RequestBody LivreEntity newlivre){
		service.postLivre(newlivre);
	}
	
	//Modifier un livre
	@PutMapping(value="/livres/{id}")
	public void postLivre(@PathVariable Integer id, @RequestBody LivreDTO livre){
		service.postLivre(LivreMapper.modifLivre(service.findById(id), livre));
	}
	
	//Afficher les auteurs
	//Afficher tous les Pokémons
	@GetMapping(value="/auteurs")
	public List<AuteurDTO> findAuteur(){
		return AuteurMapper.map(service.findAuteur());
	}
	
	//Afficher les détails d'un auteur
	@GetMapping(value="/auteurs/{id}")
	public AuteurDTO findAuteurById(@PathVariable Integer id) {
		return AuteurMapper.map(service.findAuteurById(id));
	}

}

package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.LivreDTO;
import com.univlittoral.projetback.entity.LivreEntity;

public class LivreMapper {
	public static LivreDTO map(LivreEntity entity) {
		var livre = new LivreDTO();
		
		livre.setId(entity.getId());
		livre.setNom(entity.getNom());
		livre.setEditeur(entity.getEditeur());
		livre.setNBpage(entity.getNBpage());
		livre.setDate(entity.getDate());
		livre.setLieu(entity.getLieu());
		livre.setGenre(entity.getGenre());
		livre.setAuteur(entity.getAuteur());
		
		return livre;
	}
	
	public static List<LivreDTO> map(List<LivreEntity> entities){
		if(null == entities) {
			return null;
		}
		List<LivreDTO> result = new ArrayList<LivreDTO>();
		for(final LivreEntity user : entities) {
			result.add(LivreMapper.map(user));
		}
		
		return result;
	}
	
	//Ajouter un livre
    public static LivreEntity newPokemonMapper(LivreDTO save) {
        LivreEntity newlivre = new LivreEntity();
                
        newlivre.setId(save.getId());
        newlivre.setNom(save.getNom());
        newlivre.setEditeur(save.getEditeur());
        newlivre.setNBpage(save.getNBpage());
        newlivre.setDate(save.getDate());
        newlivre.setLieu(save.getLieu());
        newlivre.setGenre(save.getGenre());
        newlivre.setAuteur(save.getAuteur()); 

        return newlivre;
    }
    
    //Modifier un livre
    public static LivreEntity modifLivre( LivreEntity modiflivre ,LivreDTO modif) {
                
    	modiflivre.setId(modif.getId());
        modiflivre.setNom(modif.getNom());
        modiflivre.setEditeur(modif.getEditeur());
        modiflivre.setNBpage(modif.getNBpage());
        modiflivre.setDate(modif.getDate());
        modiflivre.setLieu(modif.getLieu());
        modiflivre.setGenre(modif.getGenre());
        modiflivre.setAuteur(modif.getAuteur());  

        return modiflivre;
    }
	
}

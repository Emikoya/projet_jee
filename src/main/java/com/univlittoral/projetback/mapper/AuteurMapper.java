package com.univlittoral.projetback.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.projetback.dto.AuteurDTO;
import com.univlittoral.projetback.entity.AuteurEntity;

public class AuteurMapper {
	public static AuteurDTO map(AuteurEntity entity) {
		var auteur = new AuteurDTO();
		
		auteur.setId(entity.getId());
		auteur.setNom(entity.getNom());
		
		return auteur;
	}
	
	public static List<AuteurDTO> map(List<AuteurEntity> entities){
		if(null == entities) {
			return null;
		}
		List<AuteurDTO> result = new ArrayList<AuteurDTO>();
		for(final AuteurEntity user : entities) {
			result.add(AuteurMapper.map(user));
		}
		
		return result;
	}
}

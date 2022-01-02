package com.nydhal.equipes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nydhal.equipes.entities.Equipe;
import com.nydhal.equipes.entities.Tournoi;
import com.nydhal.equipes.repos.EquipeRepository;
@Service
public class EquipeServiceimpl implements EquipeService {
@Autowired
EquipeRepository equipeRepository;
@Override
public Equipe saveEquipe(Equipe E) {
return equipeRepository.save(E);
}
@Override
public  Equipe updateEquipe( Equipe E) {
return  equipeRepository.save(E);
}
@Override
public void deleteEquipe( Equipe E) {
	 equipeRepository.delete(E);
}
@Override
public void deleteEquipeById(Long id) {
	 equipeRepository.deleteById(id);
}
@Override
public  Equipe getEquipe(Long id) {
return  equipeRepository.findById(id).get();
}
@Override
public List< Equipe> getAllEquipes() {
return  equipeRepository.findAll();
}
@Override
public List<Equipe> findByNomEquipe(String nom) {
return equipeRepository.findByNomEquipe(nom);
}
@Override
public List<Equipe> findByNomEquipeContains(String nom) {
return equipeRepository.findByNomEquipeContains(nom);
}
@Override
public List<Equipe> findByNomPrix(String nom, Double prix) {
	return equipeRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Equipe> findByTournoi(Tournoi tournoi) {
	return equipeRepository.findByTournoi(tournoi);
	}
	@Override
	public List<Equipe> findByTournoiIdTou(Long id) {
	return equipeRepository.findByTournoiIdTou(id);
	}
	@Override
	
	public List<Equipe> findByOrderByNomTournoiAsc() {
		return equipeRepository.findByOrderByNomEquipeAsc();
	}
	@Override
	public List<Equipe> trierTournoisNomsPrix() {
		return equipeRepository.trierEquipesNomsPrix();
	}
}

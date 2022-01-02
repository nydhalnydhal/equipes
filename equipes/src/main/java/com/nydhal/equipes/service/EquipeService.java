package com.nydhal.equipes.service;

import java.util.List;
import com.nydhal.equipes.entities.Equipe;
import com.nydhal.equipes.entities.Tournoi;
public interface EquipeService {
	Equipe saveEquipe(Equipe E);
	Equipe updateEquipe(Equipe E);
	void deleteEquipe(Equipe E);
	void deleteEquipeById(Long id);
	Equipe getEquipe(Long id);
	List<Equipe> getAllEquipes();
	
	List<Equipe> findByNomEquipe(String nom);
	List<Equipe> findByNomEquipeContains(String nom);
	List<Equipe> findByNomPrix (String nom, Double prix);
	List<Equipe> findByTournoi (Tournoi tournoi);
	List<Equipe> findByTournoiIdTou(Long id);
	List<Equipe> findByOrderByNomTournoiAsc();
	List<Equipe> trierTournoisNomsPrix();

}

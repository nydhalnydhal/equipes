package com.nydhal.equipes.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nydhal.equipes.entities.Equipe;
import com.nydhal.equipes.entities.Tournoi;
@RepositoryRestResource(path = "rest")
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
	List<Equipe> findByNomEquipe(String nom);
	List<Equipe> findByNomEquipeContains(String nom);
	/*@Query("select E from Equipe E where E.nomEquipe like %?1 and E.prixEquipe > ?2")
	List<Equipe> findByNomPrix(String nom, double prix);*/
	@Query("select E from Equipe E where E.nomEquipe like %:nom and E.prixEquipe > :prix")
	List<Equipe> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	@Query("select E from Equipe E where E.tournoi = ?1")
	List<Equipe> findByTournoi (Tournoi tournoi);
	
	List<Equipe> findByTournoiIdTou(Long id);
	
	List<Equipe> findByOrderByNomEquipeAsc();
	
	@Query("select E from Equipe E order by E.nomEquipe ASC, E.prixEquipe DESC")
	List<Equipe> trierEquipesNomsPrix ();
	
}

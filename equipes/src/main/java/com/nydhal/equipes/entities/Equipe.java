package com.nydhal.equipes.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Equipe {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idEquipe;
private String nomEquipe;
private Double prixEquipe;
private Date dateCreation;
@ManyToOne
private Tournoi tournoi;
public Equipe() {
super();
}
public Equipe(String nomEquipe, Double prixEquipe, Date dateCreation) {
super();
this.nomEquipe = nomEquipe;
this.prixEquipe = prixEquipe;
this.dateCreation = dateCreation;
}
public Long getIdEquipe() {
	return idEquipe;
	}
	public void setIdEquipe(Long idEquipe) {
	this.idEquipe = idEquipe;
	}
	public String getNomEquipe() {
	return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
	this.nomEquipe = nomEquipe;
	}
	public Double getPrixEquipe() {
	return prixEquipe;
	}
	public void setPrixEquipe(Double prixEquipe) {
	this.prixEquipe = prixEquipe;
	}
	public Date getDateCreation() {
	return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
	return "Produit [idEquipe=" + idEquipe + ", nomEquipe=" +

	nomEquipe + ", prixEquipe=" + prixEquipe

	+ ", dateCreation=" + dateCreation + "]";

	}
	public Tournoi getTournoi() {
		return tournoi;
	}
	public void setTournoi(Tournoi tournoi) {
		this.tournoi = tournoi;
	}
	
		
	}
	


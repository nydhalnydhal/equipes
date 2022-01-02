package com.nydhal.equipes.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tournoi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idTou;
	private String nomTou;
	private String descriptionTou;
	@JsonIgnore
	@OneToMany(mappedBy = "tournoi")
	
	private List<Equipe> equipes;
	
	
	
	
	
	}

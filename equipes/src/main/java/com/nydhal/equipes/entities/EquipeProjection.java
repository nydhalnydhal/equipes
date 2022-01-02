package com.nydhal.equipes.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomEqui", types = { Equipe.class })
public interface EquipeProjection {
	public String getNomEquipe();

}

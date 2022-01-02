package com.nydhal.equipes.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nydhal.equipes.entities.Equipe;
import com.nydhal.equipes.service.EquipeService;

@RestController	
@RequestMapping("/api")
@CrossOrigin
public class EquipeRESTController {
	@Autowired
EquipeService equipeService ;
	@RequestMapping(path = "all",method = RequestMethod.GET)
	public List<Equipe> getAllEquipes()
	{
	 return equipeService.getAllEquipes(); 
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Equipe getEquipeById(@PathVariable("id") Long id) {
	return equipeService.getEquipe(id);
}
	@RequestMapping(method = RequestMethod.POST)
	public Equipe createEquipe(@RequestBody Equipe equipe) {
	return equipeService.saveEquipe(equipe);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Equipe updateEquipe(@RequestBody Equipe equipe) {
		return equipeService.updateEquipe(equipe);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteEquipe(@PathVariable("id") Long id)
	{
		equipeService.deleteEquipeById(id);
	}
	@RequestMapping(value="/prodsTou/{idTou}",method = RequestMethod.GET)
	public List<Equipe> getEquipesByTouId(@PathVariable("idTou") Long idTou) {
	return equipeService.findByTournoiIdTou(idTou);
	}
	
	}

	

package com.raman.vidagrillo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raman.vidagrillo.model.Team;
import com.raman.vidagrillo.respository.TeamRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class TeamController {

	@Autowired
    private TeamRepository teamRepository;

    @GetMapping("/teams")
    public List<Team> fetchData()
    {
    	List<Team> teams = teamRepository.findAll();
    	return teams;
    }
	
}

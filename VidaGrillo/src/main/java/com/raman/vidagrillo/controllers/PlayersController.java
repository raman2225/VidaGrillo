package com.raman.vidagrillo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raman.vidagrillo.model.Player;
import com.raman.vidagrillo.respository.PlayersRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PlayersController {

	@Autowired
    private PlayersRepository playersRepository;

    @GetMapping("/players")
    public List<Player> fetchData()
    {
    	List<Player> players = playersRepository.findAll();
    	return players;
    }
	
}

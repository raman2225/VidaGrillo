package com.raman.vidagrillo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raman.vidagrillo.model.Player;

@Repository
public interface PlayersRepository extends JpaRepository<Player, Long> {

	List<Player> findAll();
	
}

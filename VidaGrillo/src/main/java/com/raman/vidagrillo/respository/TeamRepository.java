package com.raman.vidagrillo.respository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.raman.vidagrillo.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

	List<Team> findAll();
	
}
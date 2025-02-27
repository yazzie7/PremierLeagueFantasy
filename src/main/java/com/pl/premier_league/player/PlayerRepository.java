package com.pl.premier_league.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Providing CRUD operations
@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

    void deleteByName(String playerName);
    //find player by any name , handling cases in case we dont find player in the repo
    Optional<Player> findByName(String name);
}

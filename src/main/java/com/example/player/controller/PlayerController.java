package com.example.player.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.player.model.player;

@RestController
public class PlayerController {

    @Autowired
    private PlayH2Service playService;

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/players/{playId}")
    public Player getPlayerById(@PathVeriable("playerId") int playerId) {
        return playerService.getPlayerById(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playService.updatePlayer(playerId, player);
    }

    DeleteMapping("/players/{playerId}")

    public void deletePlayer(@PathVariable int playerId) {
        playerService.deletePlayer(playerId);
    }
}

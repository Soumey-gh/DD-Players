package com.example.ddplayers.web.controller;


import com.example.ddplayers.model.Players;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@RestController
public class PlayersController {

//    RestTemplate restTemplate = new RestTemplate() ;


    private ArrayList<Players> players;

    public PlayersController() {
        this.players = new ArrayList<>();
    }



    @Operation(summary = "Get the players")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the players",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Players.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Players not found",
                    content = @Content) })
    @GetMapping("/players")
    public ArrayList<Players> afficherHeroes() {
        return players;
    }



    @Operation(summary = "Get the players by id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the player",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Players.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),})
    @GetMapping("/players/{id}")
    public  Players heroesById(@PathVariable int id){
        for (int i = 0; i < players.size(); i++) {
            if (id == players.get(i).getId()) {
                return players.get(i);
            }
        }
        return null ;
    }

    @Operation(summary = "Add a new player")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Welcome for the new player",
                    content = { @Content(mediaType = "application/json",
                            schema = @Schema(implementation = Players.class)) }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Players not found",
                    content = @Content) })
    @PostMapping("/player")
    public void addplayer (@RequestBody Players player) {
        players.add(player);

    }






}




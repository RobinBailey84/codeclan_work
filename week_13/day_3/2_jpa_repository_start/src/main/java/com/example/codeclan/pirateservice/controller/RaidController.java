package com.example.codeclan.pirateservice.controller;

import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repository.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/raids")
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

    @GetMapping
    public List<Raid> getAllPirates(){
        return raidRepository.findAll();
    }

    @GetMapping(value = "pirates/{firstName}")
    public List<Ship> getShipsWithPirateCalled(@PathVariable String firstName){
        return raidRepository.findShipsThatHavePiratesNamed(firstName);
    }

    @GetMapping(value = "pirates/ship/{shipId}")
    public List<Raid> getRaidsWithPiratesOfAShip(@PathVariable Long shipId){
        return raidRepository.findRaidsWithPiratesFromShip(shipId);
    }
}

package com.example.codeclan.pirateservice.repository;

import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;

import java.util.List;

public interface RaidRepositoryCustom {

    List<Ship> findShipsThatHavePiratesNamed(String firstName);

    List<Raid> findRaidsWithPiratesFromShip(Long id);
}

package com.codeclan.example.pirateservice.Repositories;

import com.codeclan.example.pirateservice.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {


}

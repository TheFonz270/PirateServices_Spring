package com.codeclan.example.PirateService;

import com.codeclan.example.PirateService.models.Pirate;
import com.codeclan.example.PirateService.models.Raid;
import com.codeclan.example.PirateService.models.Ship;
import com.codeclan.example.PirateService.repositories.PirateRepository;
import com.codeclan.example.PirateService.repositories.RaidRepository;
import com.codeclan.example.PirateService.repositories.ShipRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
// @AutoConfigureTestDatabase
@SpringBootTest
class PirateServiceApplicationTests {
	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirateAndShip(){
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);

		Raid raid = new Raid("Tortuga", 100);
		Raid raid2 = new Raid("Port Royal", 500);
		raidRepository.save(raid);
		raidRepository.save(raid2);

		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(pirate1);

		Pirate pirate2 = new Pirate("Hector", "Barbosa", 52, ship);
		pirateRepository.save(pirate2);

		List raids1 = new ArrayList();
		raids1.add(raid);
		raids1.add(raid2);
		List raids2 = new ArrayList();
		raids2.add(raid2);

		pirate1.setRaids(raids1);
		pirate2.setRaids(raids2);
		pirateRepository.save(pirate1);
		pirateRepository.save(pirate2);
	}

}

package com.haythem;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.haythem.entitie.Etudiant;
import com.haythem.entitie.Formation;
import com.haythem.repository.EtudiantRepository;
import com.haythem.repository.FormationRepository;

@SpringBootApplication
public class SpringBootMicroServiceApplication implements CommandLineRunner {

	@Autowired
	private EtudiantRepository etudiantRepository;
	@Autowired
	private FormationRepository formationRepository;
	@Autowired
	private RepositoryRestConfiguration configuration;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
//		Formation f1=formationRepository.save(new Formation("php", 60));
//		Formation f2=formationRepository.save(new Formation("java", 60));
//		Formation f3=formationRepository.save(new Formation("c", 60));
//		etudiantRepository.save(new Etudiant("hachem","jebel",new Date(),f1));
//		etudiantRepository.save(new Etudiant("salah","sallemi",new Date(),f2));
//		etudiantRepository.save(new Etudiant("hachem","jebel",new Date(),f3));
//		
	}

}

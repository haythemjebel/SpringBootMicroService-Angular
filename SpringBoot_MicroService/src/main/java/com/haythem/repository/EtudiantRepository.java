package com.haythem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.haythem.entitie.Etudiant;
@RepositoryRestResource 
//@CrossOrigin("http://localhost:4200") sinon class config
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}

package com.idat.freecomerce.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.freecomerce.Model.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

	Optional<Client> findByCode(int id);

	List<Client> findAllByLibelleContaining(String libelle);

	List<Client> findAllByEmail(String email);
}

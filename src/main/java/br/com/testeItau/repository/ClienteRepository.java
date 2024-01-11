package br.com.testeItau.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.testeItau.entity.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, Long>{

}

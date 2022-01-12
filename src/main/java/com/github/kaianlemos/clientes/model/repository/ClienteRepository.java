package com.github.kaianlemos.clientes.model.repository;

import com.github.kaianlemos.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {


}

package com.github.kaianlemos.clientes.model.repository;

import com.github.kaianlemos.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByUsername (String username);

    boolean existsByUsername(String username);
}

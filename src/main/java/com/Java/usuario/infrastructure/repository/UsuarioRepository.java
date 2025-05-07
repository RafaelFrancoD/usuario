package com.Java.usuario.infrastructure.repository;

import com.rafael.aprendendo_java.infrastructure.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);

    Optional<Usuario> findByEmail(String email);
    @Transactional
    void  deleteByEmail(String email);

}

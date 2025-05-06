package com.Java.usuario.infrastructure.repository;

import com.rafael.aprendendo_java.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Enderecorepository extends JpaRepository<Endereco, Long> {


}

package com.guilherme.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.lombok.projetoLombok.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}

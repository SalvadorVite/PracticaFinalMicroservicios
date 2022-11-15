package com.examenfinal.administracionusuarios.repository;

import com.examenfinal.administracionusuarios.entity.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, String> {
    Optional<Usuarios> findById(String id);
}

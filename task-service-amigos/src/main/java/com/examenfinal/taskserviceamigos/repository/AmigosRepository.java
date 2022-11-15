package com.examenfinal.taskserviceamigos.repository;

import com.examenfinal.taskserviceamigos.entity.Amigos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmigosRepository extends JpaRepository<Amigos, String> {
}

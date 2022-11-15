package com.examenfinal.msconfirmaciones.repository;

import com.examenfinal.msconfirmaciones.entity.Confirmaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmacionRespository extends JpaRepository<Confirmaciones, String> {

}

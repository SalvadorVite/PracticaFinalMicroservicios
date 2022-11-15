package com.examenfinal.mssolicitudes.repository;

import com.examenfinal.mssolicitudes.entity.CatalogoSolicitudes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogoSolicitudesRepository extends JpaRepository<CatalogoSolicitudes, String> {
}

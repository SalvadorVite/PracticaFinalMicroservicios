package com.examenfinal.mssolicitudes.service;

import com.examenfinal.mssolicitudes.entity.CatalogoSolicitudes;
import com.examenfinal.mssolicitudes.modelo.CatalogoSolicitudesDto;
import com.examenfinal.mssolicitudes.repository.CatalogoSolicitudesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogoSolicitudesServiceImpl implements CatalogoSolicitudesService {
    @Autowired
    private CatalogoSolicitudesRepository catalogoSolicitudesRepository;
    @Override
    public CatalogoSolicitudes guardarCatalogos(CatalogoSolicitudesDto catalogoSolicitudesDto) {
        CatalogoSolicitudes catalogoSolicitudes = CatalogoSolicitudes.from(catalogoSolicitudesDto);
        return catalogoSolicitudesRepository.save(catalogoSolicitudes);
    }

    @Override
    public CatalogoSolicitudes obtenerCatalogo(String id) {
        return catalogoSolicitudesRepository.findOne(id);
    }

    @Override
    public List<CatalogoSolicitudes> obtenerCatalogos() {
        return catalogoSolicitudesRepository.findAll();
    }

    @Override
    public CatalogoSolicitudes modificarCatalogo(String id, CatalogoSolicitudesDto catalogoSolicitudesDto) {
        CatalogoSolicitudes catalogoSolicitudesS = catalogoSolicitudesRepository.findOne(id);
        catalogoSolicitudesS.setId(id);
        catalogoSolicitudesS.setNombre(catalogoSolicitudesDto.getNombre());
        catalogoSolicitudesS.setDescripcion(catalogoSolicitudesDto.getDescripcion());
        catalogoSolicitudesS.setStatus(catalogoSolicitudesDto.getStatus());
        CatalogoSolicitudes catalogoSolicitudes = catalogoSolicitudesRepository.save(catalogoSolicitudesS);
        return catalogoSolicitudes;
    }
}

package com.examenfinal.mssolicitudes.entity;

import com.examenfinal.mssolicitudes.modelo.CatalogoSolicitudesDto;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "catalogos_tipos_solicitudes")
public class CatalogoSolicitudes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", updatable = false)
    private String id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String descripcion;

    private Boolean status;

    public static CatalogoSolicitudes from(CatalogoSolicitudesDto catalogoSolicitudesDto) {
        CatalogoSolicitudes catalogoSolicitudes = new CatalogoSolicitudes();
        catalogoSolicitudes.setNombre(catalogoSolicitudesDto.getNombre());
        catalogoSolicitudes.setDescripcion(catalogoSolicitudesDto.getDescripcion());
        catalogoSolicitudes.setStatus(catalogoSolicitudesDto.getStatus());
        return catalogoSolicitudes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}

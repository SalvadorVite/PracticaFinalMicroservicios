package com.examenfinal.taskserviceamigos.entity;

import com.examenfinal.taskserviceamigos.modelo.AmigosDto;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "amigos")
public class Amigos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_amistad", updatable = false)
    private String id;

    @Column(name = "id_usuario")
    @NotBlank
    private String idUsuario;

    @Column(name = "id_amigo")
    @NotBlank
    private String idAmigo;

    private Boolean status;

    @Column(name = "fecha_creacion")
    private String fechaCreacion;

    @Column(name = "fecha_inicio_amistad")
    private String fechaInicioAmistad;

    public static Amigos from(AmigosDto amigosDto) {
        Amigos amigos = new Amigos();
        amigos.setIdUsuario(amigosDto.getIdUsuario());
        amigos.setIdAmigo(amigosDto.getIdAmigo());
        amigos.setStatus(amigosDto.getStatus());
        amigos.setFechaCreacion(new Date().toString());
        return amigos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(String idAmigo) {
        this.idAmigo = idAmigo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaInicioAmistad() {
        return fechaInicioAmistad;
    }

    public void setFechaInicioAmistad(String fechaInicioAmistad) {
        this.fechaInicioAmistad = fechaInicioAmistad;
    }
}

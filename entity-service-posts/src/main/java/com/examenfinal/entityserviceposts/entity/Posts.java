package com.examenfinal.entityserviceposts.entity;

import com.examenfinal.entityserviceposts.modelo.PostsDto;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Posts implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_publicacion", updatable = false)
    private String id;

    @Column(name = "id_usuario")
    @NotBlank
    private String idUsuario;

    @NotBlank
    private String titulo;

    @NotBlank
    private String descripcion;

    @Column(name = "foto_url")
    private String fotoUrl;

    @Column(name = "id_tipo_publicacion")
    @NotBlank
    private String idTipoPublicacion;

    @Column(name = "post_publico")
    private Boolean postPublico;

    private Boolean status;

    @Column(name = "fecha_creacion")
    private String fechaCreacion;

    @Column(name = "fecha_actualizacion")
    private String fechaActualizacion;

    public static Posts from(PostsDto postsDto) {
        Posts posts = new Posts();
        posts.setIdUsuario(postsDto.getIdUsuario());
        posts.setTitulo(postsDto.getTitulo());
        posts.setDescripcion(postsDto.getDescripcion());
        posts.setFotoUrl(postsDto.getFotoUrl());
        posts.setIdTipoPublicacion(postsDto.getIdTipoPublicacion());
        posts.setPostPublico(postsDto.getPostPublico());
        posts.setStatus(postsDto.getStatus());
        posts.setFechaCreacion(new Date().toString());
        return posts;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getIdTipoPublicacion() {
        return idTipoPublicacion;
    }

    public void setIdTipoPublicacion(String idTipoPublicacion) {
        this.idTipoPublicacion = idTipoPublicacion;
    }

    public Boolean getPostPublico() {
        return postPublico;
    }

    public void setPostPublico(Boolean postPublico) {
        this.postPublico = postPublico;
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

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }
}
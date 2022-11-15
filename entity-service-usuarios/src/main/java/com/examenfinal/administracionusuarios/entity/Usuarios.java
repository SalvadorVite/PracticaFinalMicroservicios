package com.examenfinal.administracionusuarios.entity;

import com.examenfinal.administracionusuarios.modelo.UsuariosDto;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;
//import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(updatable = false)
    private String id;

    @NotBlank
    private String usuario;

    @NotBlank
    private String nombre;

    @Column(name = "apellido_paterno")
    @NotBlank
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    @NotBlank
    private String apellidoMaterno;

    private Integer edad;

    @NotBlank
    private String email;

    @NotBlank
    private String direccion;

    private Boolean status;

    public static Usuarios from(UsuariosDto usuariosDto) {
        Usuarios usuarios = new Usuarios();
        usuarios.setUsuario(usuariosDto.getUsuario());
        usuarios.setNombre(usuariosDto.getNombre());
        usuarios.setApellidoPaterno(usuariosDto.getApellidoPaterno());
        usuarios.setApellidoMaterno(usuariosDto.getApellidoMaterno());
        usuarios.setEdad(usuariosDto.getEdad());
        usuarios.setEmail(usuariosDto.getEmail());
        usuarios.setDireccion(usuariosDto.getDireccion());
        usuarios.setStatus(usuariosDto.getStatus());
        return usuarios;
    }

    public UsuariosDto to() {
        UsuariosDto usuariosDto = new UsuariosDto();
        usuariosDto.setId(getId());
        usuariosDto.setUsuario(getUsuario());
        usuariosDto.setNombre(getNombre());
        usuariosDto.setApellidoPaterno(getApellidoPaterno());
        usuariosDto.setApellidoMaterno(getApellidoMaterno());
        usuariosDto.setEdad(getEdad());
        usuariosDto.setEmail(getEmail());
        usuariosDto.setDireccion(getDireccion());
        usuariosDto.setStatus(getStatus());
        return usuariosDto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
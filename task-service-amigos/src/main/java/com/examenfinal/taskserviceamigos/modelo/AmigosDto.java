package com.examenfinal.taskserviceamigos.modelo;

public class AmigosDto {

    private String idAmistad;
    private String idUsuario;
    private String idAmigo;
    private Boolean status;
    private String fechaCreacion;
    private String fechaInicioAmistad;

    public String getIdAmistad() {
        return idAmistad;
    }

    public void setIdAmistad(String idAmistad) {
        this.idAmistad = idAmistad;
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

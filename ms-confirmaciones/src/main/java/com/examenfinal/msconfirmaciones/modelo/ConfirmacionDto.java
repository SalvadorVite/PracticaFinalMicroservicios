package com.examenfinal.msconfirmaciones.modelo;

public class ConfirmacionDto {
    private String id;
    private String idSolicitudAmistad;
    private String detallesSolicitud;
    private Boolean respuestaSolicitud;
    private Boolean status;
    private String fechaConfirmacion;

    public String getIdSolicitudAmistad() {
        return idSolicitudAmistad;
    }

    public void setIdSolicitudAmistad(String idSolicitudAmistad) {
        this.idSolicitudAmistad = idSolicitudAmistad;
    }

    public String getDetallesSolicitud() {
        return detallesSolicitud;
    }

    public void setDetallesSolicitud(String detallesSolicitud) {
        this.detallesSolicitud = detallesSolicitud;
    }

    public Boolean getRespuestaSolicitud() {
        return respuestaSolicitud;
    }

    public void setRespuestaSolicitud(Boolean respuestaSolicitud) {
        this.respuestaSolicitud = respuestaSolicitud;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getFechaConfirmacion() {
        return fechaConfirmacion;
    }

    public void setFechaConfirmacion(String fechaConfirmacion) {
        this.fechaConfirmacion = fechaConfirmacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

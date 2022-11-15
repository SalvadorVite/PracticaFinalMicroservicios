package com.examenfinal.taskserviceamigos.modelo.remote;

public class SolicitudesResumenDto {
    private String idSolicitud;
    private String fechaSolicitud;
    private Boolean status;
    private String detallesSolicitud;

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDetallesSolicitud() {
        return detallesSolicitud;
    }

    public void setDetallesSolicitud(String detallesSolicitud) {
        this.detallesSolicitud = detallesSolicitud;
    }
}
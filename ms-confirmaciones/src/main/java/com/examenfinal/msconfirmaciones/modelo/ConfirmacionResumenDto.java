package com.examenfinal.msconfirmaciones.modelo;

public class ConfirmacionResumenDto {
    private String idConfirmacion;
    private Boolean respuesta;
    private String detalle;

    public String getIdConfirmacion() {
        return idConfirmacion;
    }

    public void setIdConfirmacion(String idConfirmacion) {
        this.idConfirmacion = idConfirmacion;
    }

    public Boolean getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Boolean respuesta) {
        this.respuesta = respuesta;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}

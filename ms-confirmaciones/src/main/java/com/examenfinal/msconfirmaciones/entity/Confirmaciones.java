package com.examenfinal.msconfirmaciones.entity;

import com.examenfinal.msconfirmaciones.modelo.ConfirmacionDto;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "confirmaciones_amistad")
public class Confirmaciones implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id", updatable = false)
    private String id;

    @Column(name = "id_solicitud")
    @NotBlank
    private String idSolicitudAmistad;

    @Column(name = "detalles_solicitud")
    @NotBlank
    private String detallesSolicitud;

    @Column(name = "respuesta_solicitud")
    private Boolean respuestaSolicitud;

    private Boolean status;

    @Column(name = "fecha_confirmacion")
    @NotBlank
    private String fechaConfirmacion;

    public static Confirmaciones from(ConfirmacionDto confirmacionDto) {
        Confirmaciones confirmaciones = new Confirmaciones();
        confirmaciones.setIdSolicitudAmistad(confirmacionDto.getIdSolicitudAmistad());
        confirmaciones.setDetallesSolicitud(confirmacionDto.getDetallesSolicitud());
        confirmaciones.setRespuestaSolicitud(confirmacionDto.getRespuestaSolicitud());
        confirmaciones.setStatus(confirmacionDto.getStatus());
        confirmaciones.setFechaConfirmacion(new Date().toString());
        return confirmaciones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Boolean getRespuestaSolicitud() {
        return respuestaSolicitud;
    }

    public void setRespuestaSolicitud(Boolean respuestaSolicitud) {
        this.respuestaSolicitud = respuestaSolicitud;
    }
}

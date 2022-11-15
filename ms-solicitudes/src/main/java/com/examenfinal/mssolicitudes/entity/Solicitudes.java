package com.examenfinal.mssolicitudes.entity;

import com.examenfinal.mssolicitudes.modelo.SolicitudesDto;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "solicitudes")
public class Solicitudes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id_solicitud", updatable = false)
    private String id;

    @Column(name = "id_usuario")
    @NotBlank
    private String idUsuario;

    @Column(name = "id_tipo_solicitud")
    @NotBlank
    private String idTipoSolicitud;

    private Boolean status;

    @Column(name = "detalles_solicitud")
    private String detallesSolicitud;

    @Column(name = "fecha_solicitud")
    private String fechaSolicitud;

    @Column(name = "fecha_operacion")
    private String fechaOperacion;

    public static Solicitudes from(SolicitudesDto solicitudesDto) {
        Solicitudes solicitudes = new Solicitudes();
        solicitudes.setIdUsuario(solicitudesDto.getIdUsuario());
        solicitudes.setIdTipoSolicitud(solicitudesDto.getIdTipoSolicitud());
        solicitudes.setStatus(solicitudesDto.getStatus());
        solicitudes.setDetallesSolicitud(solicitudesDto.getDetallesSolicitud());
        solicitudes.setFechaSolicitud(new Date().toString());
        return solicitudes;
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

    public String getIdTipoSolicitud() {
        return idTipoSolicitud;
    }

    public void setIdTipoSolicitud(String idTipoSolicitud) {
        this.idTipoSolicitud = idTipoSolicitud;
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

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getFechaOperacion() {
        return fechaOperacion;
    }

    public void setFechaOperacion(String fechaOperacion) {
        this.fechaOperacion = fechaOperacion;
    }
}

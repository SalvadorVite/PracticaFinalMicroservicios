package com.examenfinal.msconfirmaciones.api;

import com.examenfinal.msconfirmaciones.entity.Confirmaciones;
import com.examenfinal.msconfirmaciones.modelo.ConfirmacionDto;
import com.examenfinal.msconfirmaciones.modelo.ConfirmacionResumenDto;
import com.examenfinal.msconfirmaciones.modelo.TemplateResponse;
import com.examenfinal.msconfirmaciones.service.ConfirmacionServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/confirmaciones/v1")
public class ConfirmacionesController {

    private static final Logger logger = Logger.getLogger(ConfirmacionesController.class);

    @Autowired
    private ConfirmacionServiceImpl confirmacionServiceImpl;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public TemplateResponse guardarConfirmaciones(@RequestBody ConfirmacionDto confirmacionDto) {
        Confirmaciones confirmaciones = confirmacionServiceImpl.guardarConfirmaciones(confirmacionDto);
        TemplateResponse res = new TemplateResponse("Confirmación realizada exitosamente.", "201", confirmaciones);
        return res;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Confirmaciones> verConfirmaciones() {
        return confirmacionServiceImpl.obtenerConfirmaciones();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Confirmaciones verConfirmacionesPorId(@PathVariable String id) {
        return confirmacionServiceImpl.obtenerConfirmacion(id);
    }

    @PutMapping("")
    @ResponseStatus(HttpStatus.OK)
    public TemplateResponse confirmacion(@RequestBody ConfirmacionDto confirmacion) {
        ConfirmacionResumenDto confirmacionesAct = confirmacionServiceImpl.modificaById(confirmacion.getId(), confirmacion.getStatus());
        TemplateResponse temp = new TemplateResponse("Confirmaci{on actualizada.", "200", confirmacionesAct);
        return temp;
    }

}

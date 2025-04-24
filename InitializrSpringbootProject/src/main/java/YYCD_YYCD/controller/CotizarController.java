// src/main/java/YYCD_YYCD/controller/CotizarController.java
package YYCD_YYCD.controller;

import YYCD_YYCD.domain.Cotizacion;
import YYCD_YYCD.service.CotizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class CotizarController {

    @Autowired
    private CotizacionService cotizacionService;

    @PostMapping("/procesar-cotizacion")               // recibe el formulario
    public String procesarCotizacion(
            @Valid Cotizacion cotizacion,              // valida datos
            BindingResult result) {

        if (result.hasErrors()) {
            return "forward:/cotizar.html";            // vuelve al formulario
        }

        cotizacionService.crearCotizacion(cotizacion);
        return "redirect:/procesar-cotizacion.html";   // lleva al HTML estático
    }
}

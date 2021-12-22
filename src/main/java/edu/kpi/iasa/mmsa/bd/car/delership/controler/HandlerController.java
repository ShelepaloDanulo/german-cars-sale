package edu.kpi.iasa.mmsa.bd.car.delership.controler;

import edu.kpi.iasa.mmsa.bd.car.delership.exepcions.CarNotFoundExcepcion;
import org.springframework.http.ResponseEntity;
import edu.kpi.iasa.mmsa.bd.car.delership.model.Error;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Optional;

@ControllerAdvice
public class HandlerController {
    @ExceptionHandler(value = { CarNotFoundExcepcion.class })
    protected ResponseEntity<Error> handleConflict(RuntimeException ex, WebRequest request) {
        Error error = Error.builder().code("BAD_REQUEST").description("Statuse NOT FOUND").build();
        return ResponseEntity.of(Optional.of(error)).notFound().build();
    }
}

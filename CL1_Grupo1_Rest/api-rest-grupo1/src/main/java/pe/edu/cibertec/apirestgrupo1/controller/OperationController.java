package pe.edu.cibertec.apirestgrupo1.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.apirestgrupo1.model.MensajeResponse;
import pe.edu.cibertec.apirestgrupo1.service.OperacionesService;


@RestController
@RequestMapping(path = "api/operaciones")
public class OperationController {

        private OperacionesService operacionesService;

        @GetMapping("/costoEstacionamiento")
        public ResponseEntity<MensajeResponse> calcularCostoEstacionamiento(@RequestParam Integer horas,
                                                                            @RequestParam Integer minutos){

            return new ResponseEntity<>(
                    operacionesService.calcularCostoEstacionamiento(horas, minutos),HttpStatus.OK);
            }


}

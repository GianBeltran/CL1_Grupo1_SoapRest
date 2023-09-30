package pe.edu.cibertec.apirestgrupo1.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.apirestgrupo1.model.MensajeResponse;
import pe.edu.cibertec.apirestgrupo1.service.OperacionesService;

@AllArgsConstructor
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

            @GetMapping("/calcularPromedio")
            public ResponseEntity<MensajeResponse> calcularPromedioDescarte(@RequestParam Double nota1,
                                                                    @RequestParam Double nota2,
                                                                    @RequestParam Double nota3,
                                                                    @RequestParam Double nota4){
                return new ResponseEntity<>(
                        operacionesService.calcularPromedioDescarte(nota1, nota2, nota3, nota4),HttpStatus.OK);
            }


    @GetMapping("/verificarDNI")
    public ResponseEntity<MensajeResponse> verificarDNI( @RequestParam Integer anoNacimiento){

        return new ResponseEntity<>(
                operacionesService.verificarDNI(anoNacimiento),HttpStatus.OK);
    }

    @GetMapping("/precio")
    public ResponseEntity<MensajeResponse> calcularPrecio( @RequestParam Integer cantidad,
                                                           @RequestParam Double precio){

        return new ResponseEntity<>(
                operacionesService.calcularPrecio(cantidad,precio),HttpStatus.OK);
    }









            }



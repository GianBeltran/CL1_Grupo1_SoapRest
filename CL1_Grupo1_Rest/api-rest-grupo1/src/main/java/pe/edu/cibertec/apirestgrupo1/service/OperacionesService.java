package pe.edu.cibertec.apirestgrupo1.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.apirestgrupo1.model.MensajeResponse;

@Service
public class OperacionesService {


    public MensajeResponse calcularCostoEstacionamiento(Integer horas, Integer minutos){

        Double tiempoTotal = horas + (minutos / 60.0);
        Double costo = tiempoTotal * 1500.0;

        return MensajeResponse.builder()
                .resultado("El costo total es: "+ costo)
                .build();
    }
}

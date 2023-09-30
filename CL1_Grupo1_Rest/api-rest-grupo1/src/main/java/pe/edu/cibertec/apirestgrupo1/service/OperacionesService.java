package pe.edu.cibertec.apirestgrupo1.service;

import org.springframework.aot.generate.InMemoryGeneratedFiles;
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



    public MensajeResponse calcularPromedioDescarte(Double nota1,
                                                    Double nota2,
                                                    Double nota3,
                                                    Double nota4) {

        Double notaMinima = Math.min(Math.min(nota1,nota2),Math.min(nota3,nota4));

        Double promedio = (nota1 * 0.2 + nota2 * 0.3 + nota3 * 0.5 - notaMinima);

        return MensajeResponse.builder()
                .resultado("El promedio es: " + promedio)
                .build();
    }

    public MensajeResponse verificarDNI(Integer anoNacimiento){

        Integer añoActual = java.time.Year.now().getValue();
        Boolean Verificar = (añoActual - anoNacimiento) >= 18;

        return MensajeResponse.builder()
                .resultado("La persona debe sacar DNI: " + Verificar)
                .build();
    }


    public MensajeResponse calcularPrecio(Integer cantidad, Double precio){
        Double subtotal = cantidad * precio;
        if (subtotal > 200) {
            Double descuento = subtotal * 0.20;
            Double subtotal2 = subtotal - descuento;
            return MensajeResponse.builder()
                    .resultado("El precio es: " + subtotal2)
                    .build();
        } else {
            Double subtotal1 = subtotal;
            return MensajeResponse.builder()
                    .resultado("El precio es: " + subtotal1)
                    .build();
        }
    }


}

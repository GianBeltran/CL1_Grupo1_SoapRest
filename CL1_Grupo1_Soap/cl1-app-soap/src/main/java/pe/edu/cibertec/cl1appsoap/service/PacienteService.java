package pe.edu.cibertec.cl1appsoap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.cl1appsoap.model.Paciente;
import pe.edu.cibertec.cl1appsoap.repository.PacienteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> obtenerPacientes(){
        return pacienteRepository.findAll();
    }

    public Paciente obtenerPacienteID(Integer id){
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        if(paciente.isEmpty()){
            return null;
        }
        return paciente.get();
    }

    public Paciente guardarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
}

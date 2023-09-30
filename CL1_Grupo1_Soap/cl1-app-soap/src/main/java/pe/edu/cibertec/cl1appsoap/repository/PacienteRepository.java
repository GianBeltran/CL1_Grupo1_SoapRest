package pe.edu.cibertec.cl1appsoap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.cl1appsoap.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
}

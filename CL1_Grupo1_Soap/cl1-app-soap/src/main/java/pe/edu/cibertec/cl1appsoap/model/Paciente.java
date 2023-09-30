package pe.edu.cibertec.cl1appsoap.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "paciente")
@Getter @Setter
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpaciente;
    @Column(name = "nompaciente")
    private String nompaciente;
    @Column(name = "apepaciente")
    private String apepaciente;
    @Column(name = "docpaciente")
    private String docpaciente;
    @Column(name = "fechanacpaciente")
    private Date fechanacpaciente;
    @Column(name = "emailpaciente")
    private String emailpaciente;
}

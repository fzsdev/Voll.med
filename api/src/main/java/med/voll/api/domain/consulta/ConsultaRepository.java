package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository  extends JpaRepository<Consulta, Long> {
    Boolean existsByPacieneIdAndDataBetween (Long idPaciente, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);

    Boolean existsByMedicoIdAndData(Long idMedico, LocalDateTime data);
}

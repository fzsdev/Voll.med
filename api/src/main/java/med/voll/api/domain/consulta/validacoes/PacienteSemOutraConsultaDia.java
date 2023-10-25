package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public class PacienteSemOutraConsultaDia {

    private ConsultaRepository repository;

    public void validarPaciente(DadosAgendamentoConsulta dados) {
        var primeiroHorario = dados.data().withHour(7);
        var ultimoHorario = dados.data().withHour(18);
        var pacientePossuioOutraConsultaDia = repository.existsByPacieneIdAndDataBetween(dados.idPaciente(), primeiroHorario,
                ultimoHorario);
        if (pacientePossuioOutraConsultaDia) {
            throw new ValidacaoException("Paciente já possui consulta agendada neste dia.");
        }
    }
}

package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public class MedicoConflitoAgenda {

    private ConsultaRepository repository;

    public void validarConflitoAgenda(DadosAgendamentoConsulta dados) {
        var medicoPossuiConsultaMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
        if (medicoPossuiConsultaMesmoHorario) {
            throw new ValidacaoException("Medico já possui consulta marcada neste horario");
        }
    }
}

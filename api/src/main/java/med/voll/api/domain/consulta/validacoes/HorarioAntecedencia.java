package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

public class HorarioAntecedencia {

    public void validarAntecedencia(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();
        var horaAgora = LocalDateTime.now();

        var diferencaMinutos = Duration.between(horaAgora, dataConsulta).toMinutes();

        if (diferencaMinutos < 30) {
            throw new ValidacaoException("Consulta deve ser agendada com minimo de 30 minutos.");
        }
    }
}

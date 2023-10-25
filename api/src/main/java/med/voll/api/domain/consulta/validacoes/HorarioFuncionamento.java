package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.DayOfWeek;

public class HorarioFuncionamento {

    public void validar(DadosAgendamentoConsulta dados) {

        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesFuncionamento = dataConsulta.getHour() < 7;
        var depoisFuncionamento = dataConsulta.getHour() > 18;

        if (domingo || antesFuncionamento || depoisFuncionamento) {
            throw new ValidacaoException("Fora do horario de funcionamento.");
        }
    }
}

package med.voll.api.domain.medico;

import med.voll.api.domain.consulta.Consulta;
import med.voll.api.domain.endereco.DadosEndereco;
import med.voll.api.domain.paciente.DadosCadastroPaciente;
import med.voll.api.domain.paciente.Paciente;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class MedicoRepositoryTest {

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private TestEntityManager em;


    @Test
    @DisplayName("Deveria retornar null quando unico médico não está disponivel na data")
    void escolherMedicoAleatorioLivreC1() {

        var proximaTercaAs10 = LocalDate.now()
                .with(TemporalAdjusters.next(DayOfWeek.TUESDAY))
                .atTime(10, 00);
        var medico = cadastrarMedico("Med1", "med1@voll.med", "123456", Especialidade.ORTOPEDIA);
        var paciente = cadastrarPaciente("Pac1", "pac1@gmail.com", "000010010000");

        cadastrarConsulta(medico, paciente, proximaTercaAs10);


        var medicoLivre = medicoRepository.escolherMedicoAleatorioLivre(Especialidade.ORTOPEDIA, proximaTercaAs10);
        assertThat(medicoLivre).isEqualTo(medico);
    }


   /* private void cadastrarConsulta(Medico medico, Paciente paciente, LocalDateTime data) {
        em.persist(new Consulta(medico, paciente, data));
    }*/

    /**
     *
     */
    private void cadastrarConsulta(Medico medico, Paciente paciente, LocalDateTime data) {
        if (data != null) {
            em.persist(new Consulta(medico, paciente, data));
        } else {
            // Trate o caso em que data é nulo.
            // Você pode lançar uma exceção, registrar um aviso, etc.
            throw new IllegalArgumentException("A data da consulta não pode ser nula.");
        }
    }


    private Medico cadastrarMedico(String nome, String email, String crm, Especialidade especialidade) {
        var medico = new Medico(dadosMedico(nome, email, crm, especialidade));
        em.persist(medico);
        return medico;
    }

    private Paciente cadastrarPaciente(String nome, String email, String cpf) {
        var paciente = new Paciente(dadosPaciente(nome, email, cpf));
        em.persist(paciente);
        return paciente;
    }

    private DadosCadastroMed dadosMedico(String nome, String email, String crm, Especialidade especialidade) {
        return new DadosCadastroMed(
                nome,
                email,
                "61999999999",
                crm,
                especialidade,
                dadosEndereco()
        );
    }

    private DadosCadastroPaciente dadosPaciente(String nome, String email, String cpf) {
        return new DadosCadastroPaciente(
                nome,
                email,
                "61999999999",
                cpf,
                dadosEndereco()
        );
    }

    private DadosEndereco dadosEndereco() {
        return new DadosEndereco(
                "rua xpto",
                "bairro",
                "00000000",
                "Brasília",
                "DF",
                null,
                null
        );
    }

}
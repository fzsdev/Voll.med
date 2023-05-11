package med.voll.api.paciente;


import jakarta.validation.Valid;
import med.voll.api.endereco.DadosAtualizacaoEndereco;


    public record DadosListagemPac(Long id, String nome, String email, String cpf) {
        public DadosListagemPac(Paciente paciente) {
            this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
        }
    }


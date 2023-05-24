package med.voll.api.domain.paciente;


public record DadosListagemPac(Long id, String nome, String email, String cpf) {
    public DadosListagemPac(Paciente paciente) {
        this(paciente.getId(),
                paciente.getNome(),
                paciente.getEmail(),
                paciente.getCpf());
    }
}


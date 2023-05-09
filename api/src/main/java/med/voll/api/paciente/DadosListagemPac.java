package med.voll.api.paciente;


public record DadosListagemPac(
        Long id,
        String nome,
        String email,
        String cpf,
        String telefone

) {
    public DadosListagemPac(Paciente paciente) {
        this(paciente.getId(),paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone());
    }


}

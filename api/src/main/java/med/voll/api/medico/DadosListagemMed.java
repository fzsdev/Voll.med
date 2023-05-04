package med.voll.api.medico;

public record DadosListagemMed(
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public DadosListagemMed(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}

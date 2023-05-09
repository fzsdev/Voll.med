package med.voll.api.medico;


public record DadosListagemMed(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public DadosListagemMed(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }


}

package med.voll.api.domain.endereco;

import jakarta.validation.Valid;

public record DadosAtualizacaoEndereco(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}
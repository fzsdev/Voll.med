package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastro(@RequestBody @Valid DadosCadastroMed dados) {
        /*repository.save(new Medico(null, dados.nome(), dados.email(), dados.crm(), new Endereco(dados))); tem um metodo
         * mais facil de receber os dados*/
        repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMed> listagem(@PageableDefault(size = 10, sort = {"id"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemMed::new);
    }

    @PutMapping
    @Transactional
    public void atualizacao(@RequestBody @Valid DadosAtualizacaoMed dados) {
        var medico = repository.getReferenceById(dados.id());
        medico.atualizacaoInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void exclusao(@PathVariable Long id){
        repository.deleteById(id);
    }
}

package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMed;
import med.voll.api.medico.DadosListagemMed;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicosController {

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
    public List<DadosListagemMed> listagem() {
        return repository.findAll().stream().map(DadosListagemMed::new).toList();
    }
}

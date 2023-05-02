package med.voll.api.controller;

import med.voll.api.medico.DadosCadastroMed;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicosController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMed dados) {
        System.out.println(dados);
    }
}

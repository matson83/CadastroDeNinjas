package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")

    public String boasVindas(){
        return "Bem-vindo ao Cadastro de Ninjas!";
    }

}

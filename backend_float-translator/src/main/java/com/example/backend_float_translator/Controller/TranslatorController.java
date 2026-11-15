package com.example.backend_float_translator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/testar")
    public String testarConexao() {
        return "O Back-end do Tradutor está ONLINE! 🚀";
    }

    @GetMapping("/traduzir")
    public String traduzirTexto(@RequestParam String texto) {
        // Por enquanto, apenas simulamos uma resposta
        return "Texto recebido: " + texto + " (Processamento em breve)";
    }
}
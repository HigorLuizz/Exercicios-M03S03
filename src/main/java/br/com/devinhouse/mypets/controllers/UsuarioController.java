package br.com.devinhouse.mypets.controllers;

import br.com.devinhouse.mypets.models.UsuarioModel;
import br.com.devinhouse.mypets.services.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<UsuarioModel> getAll(){
        return this.usuarioService.getAll();
    }

}

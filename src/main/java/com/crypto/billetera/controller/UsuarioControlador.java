package com.crypto.billetera.controller;

import com.crypto.billetera.entities.Usuario;
import com.crypto.billetera.servicies.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsuarioControlador {

    @Autowired
    public UsuarioServicio usuarioServicio;

    @GetMapping("usuarios")
    private ResponseEntity<List<Usuario>> getAll() {
        return ResponseEntity.ok(usuarioServicio.usuarioRepositorio.findAll());
    }
}

package com.macedo.moneytracker.controller;

import com.macedo.moneytracker.model.User;
import com.macedo.moneytracker.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // define o caminho base para todas as requisições desse controller
public class UserController {

    private final UserService userService;

    // injeção de dependência do serviço
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // criar um novo usuário
    @PostMapping
    public User criarUsuario(@RequestBody User user) {
        return userService.criarUsuario(user);
    }

    // buscar todos os usuários cadastrados
    @GetMapping
    public List<User> listarUsuarios() {
        return userService.listarUsuarios();
    }

    // buscar um usuário por ID
    @GetMapping("/{id}")
    public User buscarUsuarioPorId(@PathVariable Long id) {
        return userService.buscarUsuarioPorId(id);
    }

    // deletar um usuário por ID
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        userService.deletarUsuario(id);
    }
}

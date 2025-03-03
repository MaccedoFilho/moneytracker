package com.macedo.moneytracker.service;

import com.macedo.moneytracker.model.User;
import com.macedo.moneytracker.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    // injeção de dependência do UserRepository
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // criar um novo usuário
    public User criarUsuario(User user) {
        return userRepository.save(user);
    }

    // listar todos os usuários
    public List<User> listarUsuarios() {
        return userRepository.findAll();
    }

    // buscar um usuário por ID
    public User buscarUsuarioPorId(Long id) {
        Optional<User> usuario = userRepository.findById(id);
        return usuario.orElse(null); // Retorna null se o usuário não for encontrado
    }

    // deletar um usuário por ID
    public void deletarUsuario(Long id) {
        userRepository.deleteById(id);
    }
}

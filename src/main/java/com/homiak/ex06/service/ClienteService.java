package com.homiak.ex06.service;


import com.homiak.ex06.models.ClienteModel;
import com.homiak.ex06.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public ClienteModel salvar(ClienteModel cliente) {
        return repository.save(cliente);
    }

    public List<ClienteModel> listar() {
        return repository.findAll();
    }

    public Optional<ClienteModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
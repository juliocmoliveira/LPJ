package com.proway.first.service;

import com.proway.first.model.Categoria;
import com.proway.first.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodos() {
        return this.categoriaRepository.findAll();
    }

    public Categoria buscarPorId(int id) {
        return this.categoriaRepository.findById(id).orElse(null);
    }

    public Categoria salvar(Categoria categoria) {
        return this.categoriaRepository.save(categoria);
    }

    public void excluir(int id) {
        this.categoriaRepository.deleteById(id);
    }
}

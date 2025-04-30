package com.proway.first.controller;

import com.proway.first.model.Categoria;
import com.proway.first.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> buscarTodos() {
        return this.categoriaService.buscarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable int id) {
        Categoria categoria = this.categoriaService.buscarPorId(id);
        if (categoria == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(categoria);
    }

    @PostMapping
    public Categoria salvar(@RequestBody Categoria categoria) {
        return this.categoriaService.salvar(categoria);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categoria> alterar(@PathVariable int id, @RequestBody Categoria categoria) {
        Categoria categoriaEncontrada = this.categoriaService.buscarPorId(id);
        if (categoriaEncontrada == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(categoriaService.salvar(categoria));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Categoria> excluir(@PathVariable int id) {
        Categoria categoriaEncontrada = this.categoriaService.buscarPorId(id);
        if (categoriaEncontrada == null) {
            return ResponseEntity.notFound().build();
        }
        this.categoriaService.excluir(id);
        return ResponseEntity.ok(categoriaEncontrada);
    }
}

package br.com.fiap.financaspro.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.financaspro.model.Categoria;
import br.com.fiap.financaspro.repository.CategoriaRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("categoria")
@Slf4j
public class CategoriaController {

    // serve pra escrever os Log do Terminal
    // Logger log = LoggerFactory.getLogger(getClass());



    @Autowired //como se fosse um extends
    CategoriaRepository repository;

    

    @GetMapping
    public List<Categoria> index() {
        return repository.findAll(); //retorna o repositório no DB

    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Categoria create(@RequestBody @Valid Categoria categoria) { // binding
        log.info("cadastrando categoria {} ", categoria);
        return repository.save(categoria);
    }
    
    // @GetMapping("{id}")
    // public ResponseEntity<Categoria> show(@PathVariable Long id){
    //     log.info("buscando categoria por id {}", id);

    //     return repository
    //         .findById(id)
    //         .map( ResponseEntity::ok) //map responsável pela conversão
    //         .orElse(ResponseEntity.notFound().build());
    //      }

    // @DeleteMapping("{id}")
    // public ResponseEntity<Object> destroy(@PathVariable Long id){
    //     log.info("apagando categoria");
        
    //     verificarSeExisteCategoria(id);


    //         repository.deleteById(id);
    //         return ResponseEntity.noContent().build();
    // }

    // @PutMapping("{id}")
    // public ResponseEntity<Categoria> update(@PathVariable Long id, @RequestBody Categoria categoria) {
    //     log.info("atualizando categoria com id {} para {}", id, categoria);
        
    //     verificarSeExisteCategoria(id);

    //         categoria.setId(id);
    //         repository.save(categoria); //serve como um UPDATE caso já exista no banco
    //         return ResponseEntity.ok(categoria);
    // }

    // private void verificarSeExisteCategoria(Long id) {
    //     repository
    //         .findById(id)
    //         .orElseThrow(() -> new ResponseStatusException(
    //                             HttpStatus.NOT_FOUND, 
    //                             "Não existe categoria com o id informado. Consulte lista em /categoria"
    //                         ));
    // }

    // private Optional<Categoria> getCategoriaById(Long id) {
    //     var categoriaEncontrada = repository  //colocando o repository em uma variável
    //             .stream()
    //             .filter(c -> c.id().equals(id))
    //             .findFirst();
    //     return categoriaEncontrada;
    // }
}
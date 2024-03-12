package br.com.fiap.financaspro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.financaspro.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // public void save(Categoria categoria);
    // public Categoria findById(Long id);
    // public List<Categoria> findAll();
    // public void deleteById(Long id);
}

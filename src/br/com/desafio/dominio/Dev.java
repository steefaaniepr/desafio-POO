package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
    private String nome;
    private Set<Conteudo> conteudosIscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); 


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosIscritos, dev.conteudosIscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }


    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIscritos, conteudosIscritos, conteudosConcluidos);
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosIscritos() {
        return conteudosIscritos;
    }

    public void setConteudosIscritos(Set<Conteudo> conteudosIscritos) {
        this.conteudosIscritos = conteudosIscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosIscritos.addAll(bootcamp.getConteudos()); 
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosIscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosIscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }

    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
        .stream()
        .mapToDouble(Conteudo::calcularXP)
        .sum();
    }

    
    

}

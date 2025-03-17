package application.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "plataformas")
public class Plataforma {
  @ID
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Colum(unique = true, nullable = false)
  private String nome;

  @ManyToMany(mappedBy = "plataformas")
  private Set<joog> jogos = new HashSet<>();

  public long getId() {
    return id;
  }

  public void setId(long id){
    this.id = id;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public Set<jogo> getJogos(){
    return jogos;
  }

  public void setJogos(Set<jogo> jogos){
    this.jogos = jogos;
  }


}
package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name =  " tb_cadastro_de_ninjas")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
    private String nome;
    private String email;
    private int idade;
    //Um ninja só pode ter uma unica missão
    @ManyToOne
    @JoinColumn(name ="missoes_id") //Foreing key ou chave estrangeira
    private List<MissoesModel> missoes;


    public NinjaModel(String nome) {
        this.nome = nome;
    }

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

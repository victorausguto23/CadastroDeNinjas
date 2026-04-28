package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
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



}

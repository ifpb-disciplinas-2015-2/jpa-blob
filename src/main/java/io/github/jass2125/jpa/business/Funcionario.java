/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.jpa.business;

import io.github.jass2125.jpa.enums.Sexo;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Anderson Souza
 * @email <jair_anderson_bs@hotmail.com>
 * @since 2016, Feb 11, 2016
 */
@Entity
@Table(name = "Funcionario")
public class Funcionario implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    
    private String nome;
    
    @Temporal(value = TemporalType.DATE)
    private Date dataDeNascimento;
    
    @Enumerated(value = EnumType.STRING)
    private Sexo sexo;
    
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] foto;
    
    
    
    public Funcionario() {
    }

    public Funcionario(String nome, Date dataDeNascimento, Sexo sexo, byte[] foto) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
        this.foto = foto;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
            
}

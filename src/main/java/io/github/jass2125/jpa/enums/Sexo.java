/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.jpa.enums;

/**
 *
 * @author Anderson Souza <>
 * @email jair_anderson_bs@hotmail.com
 * @since 2016, Feb 11, 2016
 */
public enum Sexo {
   F("Feminino"), M("Masculino");
   
   private String nome;
   private Sexo(String nome){
       this.nome = nome;
   }

   public String getNome() {
       return nome;
   }
   
   
   
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.jpa.enums;

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com>
 * @since 12:23:55, 11-Feb-2016 
 * Package io.github.jass2125.jpa.enumeration
 * Project Name jpa-enumeration-img
 * Encoding UTF-8
 * File Name UnidadeDePersistenciaEnum.java
 */
public enum UnidadeDePersistenciaEnum {
    // TODO Adicionar unidade de persistencia JPA
    POSTGRESQL("pu-postgresql"),
    MYSQL("pu-mysql");
    
    private String unidade;
    
    private UnidadeDePersistenciaEnum(String unidade) {
        this.unidade = unidade;
    }

    public String getUnidade() {
        return this.unidade;
    }
    
    
    

}

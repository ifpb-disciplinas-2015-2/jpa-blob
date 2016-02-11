package io.github.jass2125.jpa.jpa;


import io.github.jass2125.jpa.enums.UnidadeDePersistenciaEnum;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com>
 * @since 13:14:47, 11-Feb-2016 
 * Package 
 * Project Name jpa-enumeration-img
 * Encoding UTF-8
 * File Name EntityManagerJPA.java
 */
public class EntityManagerJPA {
    private static EntityManager em;
    
    private EntityManagerJPA(){
    
    }
    
    public static EntityManager getEntityManagerJPA(){
        if(em == null){
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(UnidadeDePersistenciaEnum.MYSQL.getUnidade());
            em = emf.createEntityManager();
        }
        return em;
    }

}

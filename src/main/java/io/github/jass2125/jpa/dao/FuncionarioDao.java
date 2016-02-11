/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.jpa.dao;

import io.github.jass2125.jpa.business.Funcionario;
import io.github.jass2125.jpa.jpa.EntityManagerJPA;
import javax.persistence.EntityManager;

/**
 * @author Anderson Souza <jair_anderson_bs@hotmail.com>
 * @since 13:13:25, 11-Feb-2016 
 * Package io.github.jass2125.jpa.dao
 * Project Name jpa-enumeration-img
 * Encoding UTF-8
 * File Name FuncionarioDao.java
 */
public class FuncionarioDao implements IFuncionarioDao {

    @Override
    public void add(Funcionario funcionario) {
        EntityManager em = EntityManagerJPA.getEntityManagerJPA();
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
    }

}

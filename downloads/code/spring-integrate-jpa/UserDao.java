package com.ctlok.pro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @PersistenceContext
    protected EntityManager em;
    
    public List<User> findAll(){
        return (List<Entity>) em.createQuery("SELECT e FROM User e", User.class).getResultList();
    }
    
}

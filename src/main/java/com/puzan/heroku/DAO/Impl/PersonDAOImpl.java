/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puzan.heroku.DAO.Impl;

import com.puzan.heroku.DAO.PersonDAO;
import com.puzan.heroku.Entity.Person;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author puzansakya
 */
@Repository(value = "PersonDAO")
public class PersonDAOImpl implements PersonDAO {

    @Autowired
    private SessionFactory sf;
    private Session session;
    private Transaction transaction;

    @Override
    public List<Person> getAll() {
        session = sf.openSession();
        List<Person> personList = session.createQuery("from Person").list();
        session.close();
        return personList;
    }

}

package com.jk.demo.dao.impl;

import com.jk.demo.dao.testDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class testDaoImpl implements testDao {

    @Autowired
    private  SessionFactory sessionFactory;

    @Override
    public List queryAll() {

        return  sessionFactory.getCurrentSession().createQuery("from User").list();
    }
}

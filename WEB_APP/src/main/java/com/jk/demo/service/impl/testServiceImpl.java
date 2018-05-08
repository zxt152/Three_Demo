package com.jk.demo.service.impl;

import com.jk.demo.dao.testDao;
import com.jk.demo.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testServiceImpl implements testService {

    @Autowired
    private testDao dao;

    @Override
    public List queryAll() {
        return dao.queryAll();
    }
}

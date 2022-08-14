package com.octans.demo.services;

import com.octans.demo.models.dao.RolDao;
import com.octans.demo.models.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServicesImpl implements RolService {

    @Autowired
    private RolDao rolDao;

    @Override
    public List<Rol> findAll() {
        return rolDao.findAll();
    }
}

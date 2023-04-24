package com.Proyecto_IQ23.service;

import com.Proyecto_IQ23.dao.ResenaDao;
import com.Proyecto_IQ23.domain.Resena;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ResenaServiceImpl implements ResenaService {

    @Autowired
    ResenaDao resenaDao;
    
    @Transactional(readOnly = true)
    @Override
    public List<Resena> getResena() {
        return (List<Resena>)resenaDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Resena getResena(Resena resena) {
        return resenaDao.findById(resena.getIdResena()).orElse(null);
    }

    @Override
    public void save(Resena resena) {
        resenaDao.save(resena);
    }

    @Override
    public void delete(Resena resena) {
        resenaDao.delete(resena);
    }
    
}

package com.Proyecto_IQ23.service;

import com.Proyecto_IQ23.dao.OfertaDao;
import com.Proyecto_IQ23.domain.Oferta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OfertaServiceImpl implements OfertaService {

    @Autowired
    OfertaDao ofertaDao;

    @Transactional(readOnly = true)
    @Override
    public List<Oferta> getOfertas() {
        return (List<Oferta>) ofertaDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Oferta getOferta(Oferta oferta) {
        return ofertaDao.findById(oferta.getIdOferta()).orElse(null);
    }

    @Override
    public void save(Oferta oferta) {
        ofertaDao.save(oferta);
    }

    @Override
    public void delete(Oferta oferta) {
        ofertaDao.delete(oferta);
    }

}

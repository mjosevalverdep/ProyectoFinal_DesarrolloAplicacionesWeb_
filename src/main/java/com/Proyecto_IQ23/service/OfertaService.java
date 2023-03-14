package com.Proyecto_IQ23.service;

import com.Proyecto_IQ23.domain.Oferta;
import java.util.List;

public interface OfertaService {

    public List<Oferta> getOfertas();

    public Oferta getOferta(Oferta oferta);

    public void save(Oferta oferta);

    public void delete(Oferta oferta);

}

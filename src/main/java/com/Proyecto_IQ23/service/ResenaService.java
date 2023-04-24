package com.Proyecto_IQ23.service;

import com.Proyecto_IQ23.domain.Resena;
import java.util.List;

public interface ResenaService {
    
    public List<Resena> getResena();
    
    public Resena getResena(Resena resena);
    
    public void save(Resena resena);
    
    public void delete(Resena resena);
}

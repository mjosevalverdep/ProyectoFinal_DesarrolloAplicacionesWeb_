package com.Proyecto_IQ23.service;

import com.Proyecto_IQ23.domain.Tour;
import java.util.List;

public interface TourService {

    public List<Tour> getTours();

    public Tour getTour(Tour tour);

    public void save(Tour tour);

    public void delete(Tour tour);
}

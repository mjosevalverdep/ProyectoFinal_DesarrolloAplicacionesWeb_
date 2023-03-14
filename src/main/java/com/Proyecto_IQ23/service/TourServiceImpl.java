package com.Proyecto_IQ23.service;

import com.Proyecto_IQ23.dao.TourDao;
import com.Proyecto_IQ23.domain.Tour;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    TourDao tourDao;

    @Transactional(readOnly = true)
    @Override
    public List<Tour> getTours() {
        return (List<Tour>) tourDao.findAll();
    }
    
    @Transactional(readOnly = true)
    @Override
    public Tour getTour(Tour tour) {
        return tourDao.findById(tour.getIdTour()).orElse(null);
    }

    @Override
    public void save(Tour tour) {
        tourDao.save(tour);
    }

    @Override
    public void delete(Tour tour) {
       tourDao.delete(tour);
    }
}

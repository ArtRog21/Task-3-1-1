package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getCarList(Integer count) {
        return carDao.getCarList(count);
    }
}
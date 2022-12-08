package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> carList;
    {   carList = new ArrayList<>();

        carList.add(new Car("Audi R8", "red", 2012));
        carList.add(new Car("Audi TT", "grey", 2004));
        carList.add(new Car("Carra GS7", "grey", 2018));
        carList.add(new Car("Nissan", "white", 2006));
        carList.add(new Car("RAM1500", "blue", 2012));
    }

    @Override
    public List<Car> getCarList(Integer count) {
        if((count == null) || (count > carList.size())) {
            count = carList.size();
        }
        return carList.subList(0, count);
    }
}
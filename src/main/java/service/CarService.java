package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarService {
    private List<Car> carList = new ArrayList<>();
    public void createCar() {
        carList.add(new Car(1, "Audi", "V1"));
        carList.add(new Car(2, "Audi", "V2"));
        carList.add(new Car(3, "Audi", "V3"));
        carList.add(new Car(4, "Audi", "V4"));
        carList.add(new Car(5, "Audi", "V5"));
    }

    public List<Car> showCar(Integer count) {
        createCar();
        if(count == null) {
            return carList;
        } else if (count>0 && count<=5) {
            List<Car> listCar = new ArrayList<>();
            for (Integer i = 0; i < count; i++) {
                listCar.add(new Car(carList.get(i).getId(), carList.get(i).getBrandCar(), carList.get(i).getModel()));
            }
            return listCar;
        } else return carList;
    }
}

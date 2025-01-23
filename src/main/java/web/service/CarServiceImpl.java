package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Vaz", "Red", 100));
        cars.add(new Car("Taz", "White", 200));
        cars.add(new Car("Gaz", "Blue", 300));
        cars.add(new Car("SyperTaz", "Black", 400));
        cars.add(new Car("KOPbITO", "Invisible", 1000));
    }

    @Override
    public List<Car> getCarsList(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
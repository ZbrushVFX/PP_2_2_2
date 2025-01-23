package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;
import web.model.Car;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String getCars(Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Vaz", "Red", 100));
        cars.add(new Car("Taz", "White", 200));
        cars.add(new Car("Gaz", "Blue", 300));
        cars.add(new Car("SyperTaz", "Black", 400));
        cars.add(new Car("KOPbITO", "Invisible", 1000));

        model.addAttribute("cars", cars);
        return "cars";
    }
}
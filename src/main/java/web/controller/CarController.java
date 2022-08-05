package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    CarService carService = new CarService();
    @GetMapping()
    public String myCar(@RequestParam (value = "count",required = false) Integer count, Model model) {
        model.addAttribute("myCar", carService.showCar(count));
        return "/cars";
    }
}

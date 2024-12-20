package ma.xproce.ds_car.web;

import ma.xproce.ds_car.dto.CarDTO;
import ma.xproce.ds_car.service.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQLController {

    private CarService carService;

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO car){
        return carService.saveCar(car);
    }

    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model) {
        return carService.getCarByModel(model);
    }





}

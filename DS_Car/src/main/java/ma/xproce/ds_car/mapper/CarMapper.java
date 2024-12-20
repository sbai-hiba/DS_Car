package ma.xproce.ds_car.mapper;

import ma.xproce.ds_car.dao.entities.Car;
import ma.xproce.ds_car.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Car fromCarDTOToCar(CarDTO carDTO){
        return mapper.map(carDTO, Car.class);
    }

    public CarDTO fromCarToCarDTO(Car car){
        return mapper.map(car, CarDTO.class);
    }

}


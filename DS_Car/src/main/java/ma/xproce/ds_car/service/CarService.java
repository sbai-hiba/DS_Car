package ma.xproce.ds_car.service;

import ma.xproce.ds_car.dto.CarDTO;

import java.util.List;

public interface CarService {

    public CarDTO saveCar(CarDTO carDTO);

    public List<CarDTO> getCarByModel(String model);
}

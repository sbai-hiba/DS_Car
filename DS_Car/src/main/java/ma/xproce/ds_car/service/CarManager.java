package ma.xproce.ds_car.service;

import lombok.AllArgsConstructor;
import ma.xproce.ds_car.dao.entities.Car;
import ma.xproce.ds_car.dao.repositories.CarRepository;
import ma.xproce.ds_car.dto.CarDTO;
import ma.xproce.ds_car.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CarManager implements CarService {

    private CarRepository carRepository;
    private CarMapper carMapper;

    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        Car car = carMapper.fromCarDTOToCar(carDTO);
        car = carRepository.save(car);
        carDTO = carMapper.fromCarToCarDTO(car);
        return carDTO;
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        List<CarDTO> carDTOS = new ArrayList<>();
        for (Car car : cars) {
            carDTOS.add(carMapper.fromCarToCarDTO(car));
        }
        return carDTOS;
    }
}
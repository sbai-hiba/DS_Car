package ma.xproce.ds_car.dao.repositories;

import ma.xproce.ds_car.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    public List<Car> findByModel(String model);

}
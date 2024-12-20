package ma.xproce.ds_car;

import ma.xproce.ds_car.dao.entities.Car;
import ma.xproce.ds_car.dao.repositories.CarRepository;
import ma.xproce.ds_car.dto.CarDTO;
import ma.xproce.ds_car.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DsCarApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsCarApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CarRepository carRepository) {
return args -> {
    carRepository.saveAll(
            List.of(
                    new Car(null, "model1", "red", "12345", 234578),
                    new Car(null, "model2", "black", "56785", 7896753),
                    new Car(null, "model3", "blue", "76854", 234578),
                    new Car(null, "model4", "red", "75446", 234578)

            )
    );
};
    }

}

package ma.xproce.ds_car.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Car {

    @Id
    @GeneratedValue
    Long id_Car;
    String model;
    String color;
    String matricul;
    double price;
}

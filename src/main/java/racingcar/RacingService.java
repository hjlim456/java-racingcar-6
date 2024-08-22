package racingcar;

import racingcar.domain.Car;

import java.util.List;

public class RacingService {
    public void move(List<Car> carList){
        carList.forEach(car -> System.out.println(car));

    };
}

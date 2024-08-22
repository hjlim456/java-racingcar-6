package racingcar;

import java.util.List;

public class RacingService {
    public void move(List<Car> carList){
        carList.forEach(car -> System.out.println(car));

    };
}

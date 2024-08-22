package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;

import java.util.List;
import java.util.Random;

public class RacingService {
    public void move(List<Car> carList){
        carList.forEach(car -> {
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            if(randomNumber>=4) car.moveForward();
        });

    };
}

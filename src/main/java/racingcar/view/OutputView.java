package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static void printMessage(String message) {
        System.out.println(message);
    }
    public static void printMovingResult(Cars cars) {
        System.out.println(cars);
    }
    public static void printWinner(List<Car> winner) {
        String winnerString = winner.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.printf("최종 우승자 : %s", winnerString);
    }


}

package racingcar.view;

import racingcar.domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    public static void printMessage(String message) {
        System.out.println(message);
    }
    public static void printResult(List<Car> carList) {
        carList.forEach(car -> System.out.println(car.toString()));
        System.out.println();
    }
    public static void printWinner(List<Car> winner) {
        String winnerString = winner.stream()
                .map(Car::getName)
                .collect(Collectors.joining(", "));
        System.out.printf("최종 우승자 : %s", winnerString);
    }


}

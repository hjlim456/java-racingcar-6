package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RacingServiceTest {

    private Car car1, car2, car3;
    private RacingService racingService;

    @BeforeEach
    void setup() {
        car1 = new Car("car1");
        car2 = new Car("car2");
        car3 = new Car("car3");
        racingService = new RacingService();
    }

    @DisplayName("전진 0회시 위치 0")
    @Test
    void moveFail() {
        //given - BeforEach로 처리
        //when
        assertThat(car1.getPosition()).isEqualTo(0);
        //then
    }

    @DisplayName("전진 1회시 위치 1")
    @Test
    void moveSuccess() {
        //given - BeforEach로 처리
        //when
        car1.moveForward();
        assertThat(car1.getPosition()).isEqualTo(1);
        //then
    }

    @DisplayName("전진 여러회진행시  위치 누적확인")
    @Test
    void move_Many_Success() {
        //given - BeforEach로 처리
        Car car1 = new Car("car1");
        //when
        car1.moveForward();
        car1.moveForward();
        car1.moveForward();
        //then
        assertThat(car1.getPosition()).isEqualTo(3);

    }

    @DisplayName("우승자 한명 리스트 확인")
    @Test
    void getSingleWinner() {
        //given
        List<Car> carList = List.of(car1,car2,car3);

        //when
        car2.moveForward();
        car1.moveForward();
        List<Car> winner = racingService.getWinner(carList);

        //then
        assertThat(winner).containsExactly(car1, car2);
    }

    @DisplayName("우승자 여러명일때 리스트 확인")
    @Test
    void getDoubleWinner() {
        //given
        List<Car> carList = List.of(car1,car2,car3);

        //when
        car1.moveForward();
        car2.moveForward();
        List<Car> winner = racingService.getWinner(carList);

        //then
        assertThat(winner).containsExactly(car1, car2);
    }


}
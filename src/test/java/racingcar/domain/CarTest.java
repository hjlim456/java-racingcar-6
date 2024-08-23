package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    @ParameterizedTest
    @ValueSource(strings = {"pobi", "aaaa", "A2", "@2"})
    void nameSuccess(String name) {
        Car car = new Car(name);
        Assertions.assertThat(car.getName()).isEqualTo(name);
    }
}
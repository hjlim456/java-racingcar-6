package racingcar.domain;

import racingcar.message.ErrorMessage;

public record Car(String name) {
    private static final int MAX_NAME_LENGTH = 5;

    public Car{
        validateName(name);
    }

    private void validateName(String name) {
        if(name.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException(ErrorMessage.EXCESS_NAME_LENGTH_LIMIT);
        }
    }
}

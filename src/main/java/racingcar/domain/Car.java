package racingcar.domain;

import racingcar.message.ErrorMessage;

public class Car{
    private static final int MAX_NAME_LENGTH = 5;
    private final String name;
    private int position;

    public Car(String name){
        validateName(name);
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CAR_NAME);
        }

        if(name.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException(ErrorMessage.EXCESS_NAME_LENGTH_LIMIT);
        }
    }

    public void moveForward() {
        position++;
    }

    @Override
    public String toString() {
        return name + " : " +"-".repeat(position);
    }
}

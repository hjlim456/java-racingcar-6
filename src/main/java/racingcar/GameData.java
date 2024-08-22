package racingcar;

import java.util.List;

public record GameData(List<Car> carList, int trialCount) {
    public GameData{
        validTrialCount(trialCount);
    }

    private void validTrialCount(int trialCount) {
        if (trialCount < 0) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_TRIAL_COUNT);
        }
    }
}

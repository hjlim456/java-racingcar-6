package racingcar;

import racingcar.view.InputView;
import racingcar.view.OutputView;

public class MainController {
    private final RacingService service;

    public MainController(RacingService service) {
        this.service = service;
    }

    public void run() {
        GameData gameData = initGame();
        proceedGame(gameData);
        endGame(gameData);
    }

    //게임 초기화(시작)
    private GameData initGame() {
        return new GameData(
                InputView.inputString(Message.INPUT_CAR_NAMES),
                InputView.inputString(Message.INPUT_TRIAL_COUNT)
        );
    }


    //게임 진행
    private void proceedGame(GameData gameData) {
        int moveCount = 0;
        while (moveCount++ < gameData.trialCount()) {
            service.move(gameData);
            OutputView.printResult(gameData.racerList());
        }
    }

    //게임 종료
    private void endGame(GameData gameData) {
        OutputView.printWinner(gameData);
    }

}

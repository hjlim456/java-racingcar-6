package racingcar;

import racingcar.domain.Car;
import racingcar.domain.GameData;
import racingcar.message.ViewMessage;
import racingcar.view.InputView;

import java.util.List;

public class MainController {
    private final RacingService service;

    public MainController(RacingService service) {
        this.service = service;
    }

    public void run() {
        GameData gameData = initGame();
        proceedGame(gameData);
        //endGame(gameData);
    }

    //게임 초기화(시작)
    private GameData initGame() {
        List<String> carNames = Converter.splitByDelimiter(InputView.inputString(ViewMessage.INPUT_CAR_NAMES), ",");
        List<Car> carList =carNames.stream().map(Car::new).toList();
        return new GameData(
                carList,
                InputView.inputInteger((ViewMessage.INPUT_TRIAL_COUNT))
        );
    }


    //게임 진행
    private void proceedGame(GameData gameData) {
        int moveCount = 0;
        while (moveCount++ < gameData.trialCount()) {
            System.out.println("여기까지확인");
            //service.move(gameData.carNames());
            //OutputView.printResult(gameData.racerList());
        }
    }

    //게임 종료
//    private void endGame(GameData gameData) {
//        OutputView.printWinner(gameData);
//    }

}

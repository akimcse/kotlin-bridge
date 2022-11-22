package view

import camp.nextstep.edu.missionutils.Console
import exception.ExceptionCheck

/**
 * 사용자로부터 입력을 받는 역할을 한다.
InputView 클래스에서만 camp.nextstep.edu.missionutils.Console 의 readLine() 메서드를 이용해 사용자의 입력을 받을 수 있다.
InputView의 패키지는 변경할 수 있다.
InputView의 메서드의 시그니처(인자, 이름)와 반환 타입은 변경할 수 있다.
사용자 값 입력을 위해 필요한 메서드를 추가할 수 있다.
 */
class InputView {
    /**
     * 다리의 길이를 입력받는다.
     */
    fun readBridgeSize(): Int {
        val bridgeSize = Console.readLine()
        return ExceptionCheck().checkValidBridgeLengthInput(bridgeSize)
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    fun readMoving(): String {
        val moveLetter = Console.readLine()
        return ExceptionCheck().checkValidMoveLetterInput(moveLetter)
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    fun readGameCommand(): String {
        return ""
    }
}
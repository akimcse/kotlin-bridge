package view

import bridge.BridgeGame
import util.Game

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
OutputView의 패키지는 변경할 수 있다.
OutputView의 메서드의 이름은 변경할 수 없고, 인자와 반환 타입은 필요에 따라 추가하거나 변경할 수 있다.
값 출력을 위해 필요한 메서드를 추가할 수 있다.
 */
class OutputView {
    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     *
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun printMap(resultBridge: MutableList<Pair<String, String>>) {
        printUpLine(resultBridge)

    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     *
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    fun printResult(resultBridge: MutableList<Pair<String, String>>) {
        println(Game.RESULT.message)
        printUpLine(resultBridge)

    }

    private fun printUpLine(resultBridge: MutableList<Pair<String, String>>){
        var i = 0
        print("[")
        resultBridge.forEach { (first, second) ->
            if (first == "U") {
                print(" $second")
            } else {
                print("  ")
            }
            i++
            if(i != resultBridge.size){
                print(" |")
            }
        }
        println(" ]")
    }

}
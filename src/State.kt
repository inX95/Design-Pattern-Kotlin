/**
 * Created by brandon on 15-11-28.
 */

class State(var value: String) {
    fun method1() {
        println("execute method1")
    }

    fun method2() {
        println("execute method2")
    }
}

class Context(var state: State) {
    fun method() {
        when (state.value) {
            "state1" -> state.method1()
            "state2" -> state.method2()
        }
    }
}
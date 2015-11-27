/**
 * Created by brandon on 15-11-28.
 * 有点像er图
 */

interface Command {
    fun exe()
}

class MyCommand(private var reciver: Reciver) : Command {
    override fun exe() {
        reciver.action()
    }
}

class Reciver {
    fun action() {
        println("command received!")
    }
}

class Invoker(private var command: Command) {
    fun action() {
        command.exe()
    }
}
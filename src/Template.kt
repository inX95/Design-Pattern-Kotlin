import java.util.*

interface Observer {
    open fun update()
}

class Observer1() : Observer {
    override fun update() {
        println("observer1 has reserved!")
    }
}

class Observer2() : Observer {
    override fun update() {
        println("observer2 has reserved!")
    }
}


interface Subject {
    open fun add(observer: Observer)

    open fun del(observer: Observer)

    open fun notifyObservers()

    open fun operation()
}


abstract class AbstractSubject : Subject {

    private var vector: Vector<Observer>

    init {
        vector = Vector()
    }

    override fun add(observer: Observer) {
        vector.add(observer)
    }

    override fun del(observer: Observer) {
        vector.remove(observer)
    }

    override fun notifyObservers() {
        vector.forEach { it -> it.update() }
    }

}


public class MyDefSubject() : AbstractSubject() {
    override fun operation() {
        println("update ...")
        notifyObservers()
    }
}
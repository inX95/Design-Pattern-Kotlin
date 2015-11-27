/**
 * Created by brandon on 15-11-28.
 */

class Original(var value: String) {
    fun createMemento() = Memento(value)
    fun restoreMemento(memento: Memento) {
        this.value = memento.value
    }
}

class Memento(var value: String) {
}

class Storage(var memento: Memento) {

}
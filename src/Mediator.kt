/**
 * Created by brandon on 15-11-28.
 */

interface Mediator {
    fun createMediator()
    fun workAll()
}

class MyMediator : Mediator {
    var user1: User? = null
    var user2: User? = null
    override fun createMediator() {
        user1 = User1(this)
        user2 = User2(this)
    }

    override fun workAll() {
        user1?.work()
        user2?.work()
    }
}

abstract class User(var mediator: Mediator) {
    abstract fun work()
}

class User1(mediator: Mediator) : User(mediator) {
    override fun work() {
        println("user1 exe...")
    }
}

class User2(mediator: Mediator) : User(mediator) {
    override fun work() {
        println("user2 exe...")
    }
}
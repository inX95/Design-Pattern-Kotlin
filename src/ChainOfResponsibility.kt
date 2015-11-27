/**
 * Created by brandon on 15-11-28.
 */

interface Handler {
    open fun operator()
}

abstract class AbstractHandler {
    var handler: Handler? = null
}

class MyHandler private constructor(private var name: String) : AbstractHandler(), Handler {
    override fun operator() {
        println("name:$name")
        handler?.operator()
    }
}



/**
 * Created by brandon on 15-11-27.
 */

interface Sourceable {
    open fun method()
}

public class SourceSub1 : Sourceable {
    override fun method() {
        println("this (${this.javaClass}) is the first sub!")
    }
}

public class SourceSub2 : Sourceable {
    override fun method() {
        println("this (${this.javaClass}) is the second sub")
    }
}

open class Bridge {
    var source: Sourceable? = null

    public fun method() = source?.method()
}

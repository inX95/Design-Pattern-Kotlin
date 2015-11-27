public class Singleton private constructor() {
    init {
        println("this $this is a singleton")
    }

    private object Holder {
        val INSTANCE = Singleton()
    }

    companion object {
        val instance: Singleton by lazy { Holder.INSTANCE }
    }

    var b: String? = null
        set(value) {
            field = value
        }
        get() {
            return field
        }
}

public object Singleton2 {
    var a: String? = null
}
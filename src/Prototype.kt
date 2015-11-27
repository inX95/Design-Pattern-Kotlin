import java.io.*

/**
 * Created by brandon on 15-11-27.
 * 原型模式
 */
public class Prototype : Cloneable, Serializable {
    companion object {
        private val serialVersionUID: Long = 1L
    }

    private var string: String? = null

    var obj: SerializableObject? = null

    /*浅复制*/
    override fun clone(): Any {
        return super.clone()
    }

    /*深复制*/
    fun deepClone(): Any {
        var bos = ByteArrayOutputStream()
        ObjectOutputStream(bos).writeObject(this)
        return ObjectInputStream(ByteArrayInputStream(bos.toByteArray())).readObject()
    }

    class SerializableObject : Serializable {
        companion object {
            private val serialVersionUID = 1L
        }
    }
}

fun Prototype.sayHello() {
    println("Hi, I am $this in Prototype")
}
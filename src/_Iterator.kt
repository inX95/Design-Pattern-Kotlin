import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * Created by brandon on 15-11-27.
 */
interface Collection {
    open fun iterator(): Iterator
    open operator fun get(index: Int): Any
    open fun size(): Int
}

interface Iterator {
    open fun previous(): Any
    open fun next(): Any
    open fun hasNext(): Boolean
    open fun first(): Any
}

class MyCollection() : Collection {
    var strings = arrayOf("A", "B", "C", "D", "E")

    override operator fun get(index: Int): Any {
        println("index:$index")
        return strings[index]
    }

    override fun size(): Int {
        return strings.size
    }

    override fun iterator(): Iterator {
        return MyIterator(this)
    }
}

class MyIterator(var collection: Collection) : Iterator {
    var pos = -1
    override fun previous(): Any {
        if (pos > 0) {
            pos--
        }
        return collection[pos]
    }

    override fun next(): Any {
        if (pos < collection.size() - 1) {
            pos++
        }
        return collection[pos]
    }

    override fun hasNext(): Boolean {
        return pos < collection.size() - 1
    }

    override fun first(): Any {
        pos = 0
        return collection[pos]
    }
}
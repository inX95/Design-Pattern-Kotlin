/**
 * Created by brandon on 15-11-27.
 */

interface ICalculator {
    open fun calculate(exp: String): Int
}

abstract class AbstractCalculator {
    fun split(exp: String, opt: String): IntArray {
        var list = exp.split(opt)
        var array = IntArray(2)
        array[0] = list[0].toInt()
        array[1] = list[1].toInt()
        return array
    }


}

public class Minus : AbstractCalculator(), ICalculator {
    override fun calculate(exp: String): Int {
        var arrayInt = split(exp, "\\-")
        return arrayInt[0] - arrayInt[1]
    }
}

public class Multiply : AbstractCalculator(), ICalculator {
    override fun calculate(exp: String): Int {
        var arrayInt = split(exp, "\\*")
        return arrayInt[0] * arrayInt[1]
    }
}
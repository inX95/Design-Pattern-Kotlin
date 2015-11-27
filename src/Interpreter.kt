/**
 * Created by brandon on 15-11-28.
 */
interface Expression {
    fun interpret(context2: Context2): Int
}

class Plus : Expression {
    override fun interpret(context2: Context2) = context2.num1 + context2.num2
}

class Minus2 : Expression {
    override fun interpret(context2: Context2) = context2.num1 - context2.num2
}

class Context2(var num1: Int, var num2: Int) {

}
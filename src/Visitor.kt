/**
 * Created by brandon on 15-11-28.
 */

interface Visitor {
    open fun visit(subject: Subject2)
}

class MyVisitor : Visitor {
    override fun visit(subject: Subject2) {
        println("visit the subject:${subject.getSubject()}")
    }

}

interface Subject2 {
    open fun accept(visitor: Visitor)
    open fun getSubject(): String
}

class MySubject2 : Subject2 {
    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }

    override fun getSubject(): String {
        return "love"
    }
}
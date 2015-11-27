fun main(args: Array<String>) {
    test_Interpreter()
}

fun test_factory() {
    var factory: SendFactory = SendFactory()
    var sender = factory.produce("mail")
    sender?.Send()
}

fun test_Singleton() {
    var singleton = Singleton2.a
    singleton = 2.toString()
    println(singleton)
}

fun test_Prototype() {
    var prototype: Prototype = Prototype()
    prototype.sayHello()
}

fun test_bridge() {
    var bridge = Bridge()
    bridge.source = SourceSub2()
    bridge.method()
    bridge.source = SourceSub1()
    bridge.method()

}

fun test_Composite() {
    var tree = Tree("A")
    var node_B = TreeNode("B")
    node_B.addChildren(TreeNode("C"))
    tree.root.addChildren(node_B)
    tree.root.printTree()
}

fun test_Strategy() {
    var exp = "2+8"
    var cal = Minus() as ICalculator
    var result = cal.calculate(exp)
    println(result)


}

fun test_Template() {
    var subject = MyDefSubject()
    subject.add(Observer1())
    subject.add(Observer2())
    subject.operation()
}

fun test_Collection() {
    var collection = MyCollection()
    var iterator = collection.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}

fun test_Memento() {
    var original = Original("egg")
    var storage = Storage(original.createMemento())
    println("init state is ${original.value}")
    original.value = "chicken"
    println("after changed :${original.value}")
    original.restoreMemento(storage.memento)
    println("restored:${original.value}")
}

fun test_State() {
    var state = State("state1")
    var context = Context(state)
    context.method()
    state.value = "state2"
    context.method()
}

fun test_Visitor() {
    var visitor = MyVisitor()
    var subject = MySubject2()
    subject.accept(visitor)
}

fun test_Mediator() {
    var mediator = MyMediator()
    mediator.createMediator()
    mediator.workAll()
}

fun test_Interpreter() {
    var result = Minus2().interpret(Context2(Plus().interpret(Context2(9, 2)), 8))
    println(result)
}

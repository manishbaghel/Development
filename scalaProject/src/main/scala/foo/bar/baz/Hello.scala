package foo.bar.baz

object Hello extends App {

	val p = Person("Manish Baghel")
	println("Hello From " + p.name)
}

case class Person(var name: String)
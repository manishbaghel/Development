package foo.bar.baz

import org.scalatest.FunSuite

class HelloTest extends FunSuite {

	test("the name is set correctly in the constructor"){
		val p = Person("Ram")
		assert(p.name == "Ram")
	}
}

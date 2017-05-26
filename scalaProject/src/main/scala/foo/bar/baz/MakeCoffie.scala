package foo.bar.baz
import scala.util.Try
/**
  * Created by mb00549 on 5/25/2017.
  */

class MakeCoffie {
  type CoffeeBeans = String
  type GroundCoffee = String
  case class Water(temperature: Int)
  type Milk = String
  type FrothedMilk = String
  type Espresso = String
  type Cappuccino = String
  // Some type aliases, just for getting more meaningful method signatures:


  // dummy implementations of the individual steps:
  def grind(beans: CoffeeBeans): GroundCoffee = {
    println("Gringing Beans")
    s"ground coffee of $beans"
  }
  def heatWater(water: Water): Water = {
    println("heatWater")
    water.copy(temperature = 85)
  }
  def frothMilk(milk: Milk): FrothedMilk ={
    println("frothMilk")
    s"frothed $milk"
  }
  def brew(coffee: GroundCoffee, heatedWater: Water): Espresso = {
    println("brew espresso")
    "espresso"
  }
  def combine(espresso: Espresso, frothedMilk: FrothedMilk): Cappuccino = {
    println("combine cappuccino")
    "cappuccino"
  }

  // some exceptions for things that might go wrong in the individual steps
  // (we'll need some of them later, use the others when experimenting
  // with the code):
  case class GrindingException(msg: String) extends Exception(msg)
  case class FrothingException(msg: String) extends Exception(msg)
  case class WaterBoilingException(msg: String) extends Exception(msg)
  case class BrewingException(msg: String) extends Exception(msg)

  // going through these steps sequentially:

  def prepareCappuccino(): Try[Cappuccino] = for {
    ground <- Try(grind("arabica beans"))
    water <- Try(heatWater(Water(25)))
    espresso <- Try(brew(ground, water))
    foam <- Try(frothMilk("milk"))
  } yield combine(espresso, foam)
}

object MakeCoffie extends App {
  val makeCoffie :MakeCoffie = new MakeCoffie
  makeCoffie.prepareCappuccino()
}

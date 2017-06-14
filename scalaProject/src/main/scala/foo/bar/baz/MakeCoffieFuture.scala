package foo.bar.baz

/**
  * Created by mb00549 on 5/25/2017.
  */

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Random, Success}


case class Water(temperature: Int)

class MakeCoffieFuture {

  type CoffeeBeans = String
  type GroundCoffee = String
  type Milk = String
  type FrothedMilk = String
  type Espresso = String
  type Cappuccino = String


  case class GrindingException(msg: String) extends Exception(msg)
  case class FrothingException(msg: String) extends Exception(msg)
  case class WaterBoilingException(msg: String) extends Exception(msg)
  case class BrewingException(msg: String) extends Exception(msg)

  def grind(beans: CoffeeBeans): Future[GroundCoffee] = Future {
    println("start grinding...")
    Thread.sleep(Random.nextInt(2000))
    if (beans == "baked beans") throw GrindingException("are you joking?")
    println("finished grinding...")
    s"ground coffee of $beans"
  }

  def heatWater(water: Water): Future[Water] = Future{
    println("heating the water now")
    Thread.sleep(Random.nextInt(2000))
    println("hot, it's hot!")
    water.copy(temperature = 85)
  }

  def frothMilk(milk: Milk): Future[FrothedMilk] = Future {
    println("milk frothing system engaged!")
    Thread.sleep(Random.nextInt(2000))
    println("shutting down milk frothing system")
    s"frothed $milk"
  }

  def brew(coffee: GroundCoffee, heatedWater: Water): Future[Espresso] = Future {
    println("happy brewing :)")
    Thread.sleep(Random.nextInt(2000))
    println("it's brewed!")
    "espresso"
  }
}

object MakeCoffieFuture extends App {
  val makeCoffieFuture :MakeCoffieFuture = new MakeCoffieFuture

/*//  Handling future call back
  makeCoffieFuture.grind("Coffee Bean").onSuccess {
    case ground =>println("okay, got my ground coffee")
  }

  // Better way to handle future call back
  makeCoffieFuture.grind("baked beans").onComplete {
    case Success(ground) => println(s"got my $ground")
    case Failure(ex) => println("This grinder needs a replacement, seriously!")
  }*/


//  Mapping the future

//  When you are writing the function you pass to map, you’re in the future, or rather in a possible future.

  val temperatureOkay: Future[Boolean] = makeCoffieFuture.heatWater(Water(22)).map { water =>
    println("we're in the future!")
    (80 to 85).contains(water.temperature)
  }
  Thread.sleep(Random.nextInt(2000))

}


package foo.bar.baz

import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global
/**
  * Created by manish on 5/25/17.
  */
class PromiseExmple {

}

object testPromise extends App {
  val taxCutF: Future[TaxCut] = Government.redeemCampaignPledge()
  println("Now that they're elected, let's see if they remember their promises...")
  taxCutF.onComplete {
    case Success(TaxCut(reduction)) =>
      println(s"A miracle! They really cut our taxes by $reduction percentage points!")
    case Failure(ex) =>
      println(s"They broke their promises! Again! Because of a ${ex.getMessage}")
  }
  Thread.sleep(55000)

}

case class TaxCut(reduction: Int)
// either give the type as a type parameter to the factory method:


object Government {
  def redeemCampaignPledge(): Future[TaxCut] = {
    val p = Promise[TaxCut]()
    Future {
      println("Starting the new legislative period.")
      Thread.sleep(2000)
      p.success(TaxCut(20))
      println("We reduced the taxes! You must reelect us!!!!1111")
    }
    p.future
  }
}

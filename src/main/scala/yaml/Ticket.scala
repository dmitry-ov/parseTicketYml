package yaml

import scala.beans.BeanProperty

/**
  * With the Snakeyaml Constructor approach shown in the main method,
  * this class must have a no-args constructor.
  */
class Ticket {

  @BeanProperty var description : String = ""
  @BeanProperty var amounts = new java.util.ArrayList[Double]()
  @BeanProperty var prices = new java.util.ArrayList[Double]()
  @BeanProperty var discount : Int = 0
  @BeanProperty var discount_sum : Double = 0.0
  @BeanProperty var total : Double = 0.0
  @BeanProperty var id :Int = 0
  @BeanProperty var fns_code : Int = 0
  @BeanProperty var datetime = ""

  override def toString: String = "null"
}
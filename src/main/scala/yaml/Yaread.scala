package yaml

import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.constructor.Constructor
import java.io.{File, FileInputStream}


object Yaread {
  def main(args: Array[String]) {

//    val filename = "/foo/config.yaml"
//    val input = new FileInputStream(new File(filename))

    val input =
      """
        |  description: discount on the bill
        |  amounts: [1111, 2222, 3333]
        |  prices: [10.99, 11.01, 12.75]
        |  discount: 10
        |  discount_sum: 7 916.99
        |  total: 71 252.87
        |  id: 1382218218
        |  fns_code: 2504
        |  datetime: 15.04.2015 17:02
        |
        |  description: discount on one
        |  amounts: [123, 456]
        |  prices: [98.79, 70.01]
        |  discount: 7.78
        |  discount_sum: 945.36
        |  total: 43 130.37
        |  id: 803447679
        |  fns_code: 2504
        |  datetime: 18.03.2015 16:40
      """.stripMargin

    val yaml = new Yaml( new Constructor (classOf[  java.util.LinkedHashSet[Ticket]  ]))
    val e = yaml.load(input).asInstanceOf[  java.util.LinkedHashSet[Ticket] ]
    println(e)
    println(e.getClass)


//    println(e.getDescription)
//    println(e.getPrices)
  }
}


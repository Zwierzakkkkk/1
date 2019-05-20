package Przykłady

object Currency {

  def Current(D:BigDecimal, P: BigDecimal, E:BigDecimal): Unit ={

    type Money = BigDecimal
    val Dolar: Money =  3.8328
    val Pound: Money = 4.9663
    val Euro: Money = 4.3017

    val Sum : Money = Dolar*D+Pound*P+Euro*E

    println(Sum)
  }
}

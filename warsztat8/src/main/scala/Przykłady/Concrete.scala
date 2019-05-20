package Przykłady


class Concrete extends Abstract {
    type T = String
    def transform(x: String): String = x + x
    val initial = "hi"
    var current: String = initial
  }




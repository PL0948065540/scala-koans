package org.functionalkoans.forscala

import support.KoanSuite

class AboutForExpressions extends KoanSuite {

  koan("For loops can be simple") {
    val someNumbers = Range(0, 10)
    var sum = 0
    for (i <- someNumbers)
      sum += i

    sum should equal(0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9)
  }

  koan("For loops can contain additional logic") {
    val someNumbers = Range(0, 10)
    var sum = 0
    // sum only the even numbers
    for (i <- someNumbers)
      if (i % 2 == 0) sum += i

    sum should equal(0 + 2 + 4 + 6 + 8)
  }

  koan("For expressions can nest, with later generators varying more rapidly than earlier ones") {
    val xValues = Range(1, 5)
    val yValues = Range(1, 3)
    val coordinates = for {
      x <- xValues
      y <- yValues} yield (x, y)
    coordinates(4) should be(3, 1)
  }
}

/*
 * Copyright © 2012 Typesafe, Inc. All rights reserved.
 */

package com.typesafe.training.scalatrain

import TestData._
import java.lang.{ IllegalArgumentException => IAE }
import org.scalatest.{ Matchers, WordSpec }

class TrainSpec extends WordSpec with Matchers {

  "Creating a Train" should {
    "throw an IllegalArgumentException for a schedule with 0 or 1 elements" in {
      an[IAE] should be thrownBy Train(InterCityExpress(724), Vector())
      an[IAE] should be thrownBy Train(InterCityExpress(724), Vector(ice724MunichTime -> munich))
    }
  }

  "stations" should {
    "be initialized correctly" in {
      ice724.stations shouldEqual Vector(munich, nuremberg, cologne)
    }
  }
}

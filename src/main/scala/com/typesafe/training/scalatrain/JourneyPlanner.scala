package com.typesafe.training.scalatrain

class JourneyPlanner(trains: Set[Train]) {

  val stations: Set[Station] = trains.flatMap { t ⇒
    t.stations
  }

}

// vim: set ts=2 sw=2 sts=2 et:
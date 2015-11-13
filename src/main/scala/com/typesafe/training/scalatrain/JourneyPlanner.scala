package com.typesafe.training.scalatrain

class JourneyPlanner(trains: Set[Train]) {

  val stations: Set[Station] = trains.flatMap { t ⇒
    t.stations
  }

  def trainsAt(station: Station): Set[Train] = trains.filter { t ⇒
    t.stations.contains(station)
  }

}

// vim: set ts=2 sw=2 sts=2 et:
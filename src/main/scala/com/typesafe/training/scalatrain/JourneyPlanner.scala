package com.typesafe.training.scalatrain

class JourneyPlanner(trains: Set[Train]) {

  val stations: Set[Station] = trains.flatMap { t ⇒
    t.stations
  }

  def trainsAt(station: Station): Set[Train] = trains.filter { t ⇒
    t.stations.contains(station)
  }

  def stopsAt(station: Station): Set[(Time, Train)] =
    for {
      train ← trains
      schedule ← train.schedule if schedule._2 == station
    } yield schedule._1 → train // (schedule._1, train)

}

// vim: set ts=2 sw=2 sts=2 et:
package com.typesafe.training.scalatrain

class JourneyPlanner(trains: Set[Train]) {

  val stations: Set[Station] = trains.flatMap(train => train.stations)

  def trainsAt(station: Station): Set[Train] =
    trains.filter { train =>
      train.stations.contains(station)
    }

  def stopsAt(station: Station): Set[(Time, Train)] =
    for {
      train ← trains
      schedule ← train.schedule if schedule._2 == station
      time = schedule._1
    } yield (time, train)

}


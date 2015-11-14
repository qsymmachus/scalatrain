package com.typesafe.training.scalatrain

class JourneyPlanner(trains: Set[Train]) {

  val stations: Set[Station] = trains.flatMap(train => train.stations)

  def trainsAt(station: Station): Set[Train] =
    trains.filter { train =>
      train.stations.contains(station)
    }

  def stopsAt(station: Station): Set[(Time, Train)] =
    for {
      train <- trains
      (time, thisStation) <- train.schedule if thisStation == station
    } yield (time, train)

}


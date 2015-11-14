package com.typesafe.training.scalatrain

case class Train(info: TrainInfo, schedule: Seq[(Time, Station)]) {
  require(schedule.size >= 2, "Train Schedules must contain at least two stations.")

  val stations: Seq[Station] = schedule.map { s => s._2 }
}


case class Station(name: String)


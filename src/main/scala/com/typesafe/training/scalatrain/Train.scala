package com.typesafe.training.scalatrain

case class Train(kind: String, number: Int, schedule: Seq[Station]) {
  require(schedule.size >= 2, "Train Schedules must contain at least two stations.")
}


case class Station(name: String)

// vim: set ts=2 sw=2 sts=2 et:
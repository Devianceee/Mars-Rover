package org.itv.marsrover

import Datatypes._
import Datatypes.Direction._
import Datatypes.Instruction._

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  val initialState = State(North, Position(0, 0))
  val gridMap = GridMap(3, 3)
  val instructions = Instructions(List(Nothing, Nothing, RotateClockwise))

  override def run(args: List[String]): IO[ExitCode] =
    for {
      _ <- IO.pure(Rover(initialState, gridMap, instructions)) // fix later
      _ <- IO.pure(println("Exiting..."))
    } yield ExitCode.Success
}
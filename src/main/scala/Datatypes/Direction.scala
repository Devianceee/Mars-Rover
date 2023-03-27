package org.itv.marsrover
package Datatypes

object Direction {

sealed trait Direction
case object North extends Direction
case object South extends Direction
case object East extends Direction
case object West extends Direction

val rotateClockwise = Map[Direction, Direction](North -> East, West -> North, South -> West, East -> South)
val rotateAnticlockwise = Map[Direction, Direction](North -> West, West -> South, South -> East, East -> North)
}

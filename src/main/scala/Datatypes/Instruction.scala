package org.itv.marsrover
package Datatypes

object Instruction { // can probably be improved to be with Instructions.scala
  sealed trait Instruction
  case object Nothing extends Instruction
  case object RotateClockwise extends Instruction
  case object RotateAnticlockwise extends Instruction
}

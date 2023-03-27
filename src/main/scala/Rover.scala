package org.itv.marsrover

import Datatypes.Direction.{Direction, East, North, South}
import Datatypes.Instruction.Instruction
import Datatypes._

object Rover {
  def apply(initialState: State, gridMap: GridMap, instructions: Instructions) = { //
    var state = initialState // can def do this better but for simplicity i chose to use a var

    instructions.directionToMove.map { instruction =>
      state = update(state, gridMap, instruction)
    }
  }

  def update(state: State, gridMap: GridMap, instruction: Instruction) = { // called as many times as needed to update the rover position
   // move to specific orientation and then move forward once and return the updated state
    instruction match {
      case Instruction.Nothing => State(state.direction, Position(state.position.xPos + moveForward(state.direction).xPos, state.position.yPos + moveForward(state.direction).yPos)) // can def be done more elegantly
      case Instruction.RotateClockwise => State(Direction.rotateClockwise(state.direction), state.position)
      case Instruction.RotateAnticlockwise => State(Direction.rotateAnticlockwise(state.direction), state.position)
    }
  }

  def moveForward(direction: Direction): Position = {
    if (direction == North) Position(0, 1)
    else if (direction == South) Position(0, -1)
    else if (direction == East) Position(1, 0)
    else Position(-1, 0)
  }
}

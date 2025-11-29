package com.github.bsfowlie.bendoku.puzzle;

final class EmptyCell extends Cell {

  @Override
  public boolean isSolved() {

    return false;
  }

  @Override
  public Integer value() {

    return null;
  }

}

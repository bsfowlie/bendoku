package com.github.bsfowlie.bendoku.puzzle;

final class SolvedCell extends Cell {

  public SolvedCell(final int value) {

    super();
  }

  @Override
  public boolean isSolved() {

    return true;
  }

  @Override
  public Integer value() {

    return 1;
  }

}

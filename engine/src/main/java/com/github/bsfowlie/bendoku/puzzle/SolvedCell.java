package com.github.bsfowlie.bendoku.puzzle;

final class SolvedCell extends Cell {

  private final int value;

  public SolvedCell(final int value) {

    super();
    this.value = value;
  }

  @Override
  public boolean isSolved() {

    return true;
  }

  @Override
  public Integer value() {

    return value;
  }

}

package com.github.bsfowlie.bendoku.puzzle;

final class GivenCell extends Cell {

  public GivenCell(final int value) {

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

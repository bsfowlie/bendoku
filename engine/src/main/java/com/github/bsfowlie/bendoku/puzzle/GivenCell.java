package com.github.bsfowlie.bendoku.puzzle;

final class GivenCell extends Cell {

  private final int value;

  public GivenCell(final int value) {

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

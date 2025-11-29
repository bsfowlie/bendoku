package com.github.bsfowlie.bendoku.puzzle;

final class EmptyCell extends Cell implements Solvable {

  @Override
  public boolean isSolved() {

    return false;
  }

  @Override
  public Integer value() {

    return null;
  }

  @Override
  public Cell solve(final int value) {

    return new SolvedCell(value);
  }

}

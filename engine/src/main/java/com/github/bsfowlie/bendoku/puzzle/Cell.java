package com.github.bsfowlie.bendoku.puzzle;

public abstract sealed class Cell permits EmptyCell, GivenCell, SolvedCell {

   public abstract boolean isSolved();

}

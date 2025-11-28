package com.github.bsfowlie.bendoku.puzzle;

public abstract sealed class Cell permits EmptyCell, GivenCell {

   public abstract boolean isSolved();

}

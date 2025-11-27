package com.github.bsfowlie.bendoku.puzzle;

public abstract sealed class Cell permits EmptyCell {

   public abstract boolean isSolved();

}

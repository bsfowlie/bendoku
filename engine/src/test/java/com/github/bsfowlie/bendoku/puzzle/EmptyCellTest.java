package com.github.bsfowlie.bendoku.puzzle;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("An EmptyCell")
class EmptyCellTest implements WithAssertions {

  @Test
  @DisplayName("should not be solved initially")
  void shouldNotBeSolvedInitially() {

    // given
    Cell cell = new EmptyCell();

    // when
    boolean solved = cell.isSolved();

    // then
    assertThat(solved).isFalse();

  }

}

package com.github.bsfowlie.bendoku.puzzle;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A GivenCell")
class GivenCellTest implements WithAssertions {

  @Test
  @DisplayName("should be solved initially")
  void shouldBeSolvedInitially() {

    // given
    var cell = new GivenCell(1);

    // when
    var solved = cell.isSolved();

    // then
    assertThat(solved).isTrue();

  }

  @Test
  @DisplayName("should have a value")
  void shouldHaveValue() {

    // given
    var cell = new GivenCell(1);

    // when
    var value = cell.value();

    // then
    assertThat(value).isEqualTo(1);

  }

}

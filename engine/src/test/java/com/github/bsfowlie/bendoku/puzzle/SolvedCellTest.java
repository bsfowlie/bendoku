package com.github.bsfowlie.bendoku.puzzle;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("A SolvedCell")
class SolvedCellTest implements WithAssertions {

  @Test
  @DisplayName("should be solved initially")
  void shouldBeSolvedInitially() {

    // given
    var cell = new SolvedCell(1);

    // when
    var solved = cell.isSolved();

    // then
    assertThat(solved).isTrue();

  }

  @ParameterizedTest(name = "should have value {0}")
  @ValueSource(ints = {1, 2, 3, 4})
  void shouldHaveValue(final int value) {

    // given
    var cell = new SolvedCell(value);

    // when
    var actual = cell.value();

    // then
    assertThat(actual).isEqualTo(value);

  }

  @Test
  @DisplayName("should be clearable")
  void shouldBeClearable() {

    // given
    var cell = new SolvedCell(1);

    // when

    // then
    assertThat(cell).isInstanceOf(Clearable.class);

  }

  @Test
  @DisplayName("can be cleared")
  void canBeCleared() {

    // given
    Clearable solvedCell = new SolvedCell(1);

    // when
    var cleared = solvedCell.clear();

    // then
    assertThat(cleared.isSolved()).isFalse();

  }

}

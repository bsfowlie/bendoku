package com.github.bsfowlie.bendoku.puzzle;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("An EmptyCell")
class EmptyCellTest implements WithAssertions {

  @Test
  @DisplayName("should not be solved initially")
  void shouldNotBeSolvedInitially() {

    // given
    var cell = new EmptyCell();

    // when
    var solved = cell.isSolved();

    // then
    assertThat(solved).isFalse();

  }

  @Test
  @DisplayName("should not have a value")
  void shouldNotHaveValue() {

    // given
    var cell = new EmptyCell();

    // when
    var value = cell.value();

    // then
    assertThat(value).isNull();

  }

  @Test
  @DisplayName("should be solvable")
  void shouldBeSolvable() {

    // given
    var cell = new EmptyCell();

    // when

    // then
    assertThat(cell).isInstanceOf(Solvable.class);

  }

  @ParameterizedTest(name = "can be solved with value {0}")
  @ValueSource(ints = {1, 2, 3, 4})
  void canBeSolvedWithValue(final int value) {

    Solvable emptyCell = new EmptyCell();// given

    // when
    var solved = emptyCell.solve(value);

    // then
    assertThat(solved.value()).isEqualTo(value);

  }

}

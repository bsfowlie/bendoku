package com.github.bsfowlie.bendoku.puzzle;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

  @ParameterizedTest(name = "should have value {0}")
  @ValueSource(ints = {1, 2, 3, 4})
  void shouldHaveValue(final int value) {

    // given
    var cell = new GivenCell(value);

    // when
    var actual = cell.value();

    // then
    assertThat(actual).isEqualTo(value);

  }

}

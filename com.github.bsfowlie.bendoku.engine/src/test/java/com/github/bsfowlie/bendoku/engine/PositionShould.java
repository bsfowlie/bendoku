package com.github.bsfowlie.bendoku.engine;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

public final class PositionShould implements WithAssertions {
    @Test
    public void be_created() {
        assertThat(Position.at(1,1)).isNotNull();

    }

    @Test
    public void have_representation_with_row_and_column() {
        assertThat(Position.at(0,1)).hasToString("(0, 1)");
    }

    @Test
    public void have_representation_with_correct_row_and_column() {
        assertThat(Position.at(3,6)).hasToString("(3, 6)");
    }
}

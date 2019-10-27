package com.github.bsfowlie.bendoku.engine;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

public final class PositionShould implements WithAssertions {
    @Test
    public void be_created() {
        assertThat(Position.at(1,1)).isNotNull();

    }
}

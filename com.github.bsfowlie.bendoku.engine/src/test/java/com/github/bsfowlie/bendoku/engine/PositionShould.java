package com.github.bsfowlie.bendoku.engine;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

final class PositionShould implements WithAssertions {
    @Test
    void be_created() {
        // given
        Position aPosition = Position.at(1, 1);

        // when

        // then
        assertThat(aPosition).isNotNull();
    }

    @Test
    void have_representation_with_row_and_column() {
        // given
        Position aPosition = Position.at(0, 1);

        // when
        String actual = aPosition.toString();

        // then
        assertThat(actual).isEqualTo("(0, 1)");
    }

    @Test
    void have_representation_with_correct_row_and_column() {
        // given
        Position aPosition = Position.at(3, 6);

        // when
        String actual = aPosition.toString();

        // then
        assertThat(actual).isEqualTo("(3, 6)");
    }

    @Test
    void have_equals_and_hashcode() {
        // verify the equals and hashcode contracts
        EqualsVerifier.forClass(Position.class).verify();
    }

    @Test
    void be_able_to_offset_from() {
        // given
        Position aPosition = Position.at(0, 0);

        // when
        Position actual = aPosition.offsetBy(1, 2);

        // then
        assertThat(actual).isEqualTo(Position.at(1,2));
    }

    @Test
    void be_able_to_offset_from_another_position() {
        // given
        Position aPosition = Position.at(1, 2);

        // when
        Position actual = aPosition.offsetBy(2, -1);

        // then
        assertThat(actual).isEqualTo(Position.at(3,1));
    }
}

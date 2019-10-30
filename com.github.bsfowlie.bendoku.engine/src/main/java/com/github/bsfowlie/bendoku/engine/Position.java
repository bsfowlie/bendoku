package com.github.bsfowlie.bendoku.engine;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class Position {

    private final String representation;

    private Position(final String format) {
        representation = format;
    }

    public static Position at(final int row, final int column) {
        return new Position("(" + row + ", " + column + ")");
    }

    @Override
    public String toString() {
        return representation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        return Objects.equals(representation, position.representation);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(representation);
    }

}

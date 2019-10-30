package com.github.bsfowlie.bendoku.engine;

import java.util.Objects;

public final class Position {

    private final transient int row;
    private final transient int column;
    private final String representation;

    private Position(final int row, final int column, final String format) {
        this.row = row;
        this.column = column;
        representation = format;
    }

    public static Position at(final int row, final int column) {
        return new Position(row, column, "(" + row + ", " + column + ")");
    }

    @Override
    public String toString() {
        return representation;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        return Objects.equals(representation, position.representation);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(representation);
    }

    public Position offsetBy(final int deltaRow, final int deltaColumn) {
        return at(row + deltaRow, column + deltaColumn);
    }
}

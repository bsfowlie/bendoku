package com.github.bsfowlie.bendoku.engine;

import java.util.Arrays;
import java.util.List;

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
}

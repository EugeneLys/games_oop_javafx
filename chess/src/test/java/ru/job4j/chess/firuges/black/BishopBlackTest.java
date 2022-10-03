package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import ru.job4j.chess.firuges.Cell;

import java.awt.geom.Dimension2D;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @org.junit.jupiter.api.Test
    void position() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell expected = Cell.C1;
        Assert.assertEquals(expected, bb.position());
    }

    @org.junit.jupiter.api.Test
    void way() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertEquals(expected, bb.way(Cell.G5));

    }

    @org.junit.jupiter.api.Test
    void copy() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        BishopBlack expected = new BishopBlack(Cell.D2);
        Assert.assertEquals(expected.position(), bb.copy(Cell.D2).position());
    }
}
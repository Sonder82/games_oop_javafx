package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
       assertThat(bishopBlack.position(), is(Cell.F8));

    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void isDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertTrue(bishopBlack.isDiagonal(Cell.A1, Cell.B2));
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure dst = bishopBlack.copy(Cell.D6);
        assertThat(dst.position(), is(Cell.D6));
    }
}
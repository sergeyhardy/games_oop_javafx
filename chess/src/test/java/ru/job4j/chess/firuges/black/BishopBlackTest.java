package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;


public class BishopBlackTest extends TestCase {
    @Test
    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position(), is(Cell.C8));
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell [] expected = {Cell.D2 , Cell.E3, Cell.F4, Cell.G5};
        assertThat(bishopBlack.way(Cell.G5), is(expected));
    }

    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        bishopBlack = (BishopBlack) bishopBlack.copy(Cell.A6);
        assertThat(bishopBlack.position(), is(Cell.A6));
    }

    @Test
    public void testIsNotDiagonal()  {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertFalse(bishopBlack.isDiagonal(Cell.C1, Cell.G8));
    }
}
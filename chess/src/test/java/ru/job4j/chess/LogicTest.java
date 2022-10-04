package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.RookBlack;

public class LogicTest {

    @Test
    public void whenNotFound()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C2));
        logic.add(new RookBlack(Cell.D2));
        FigureNotFoundException exception = Assertions.assertThrows(FigureNotFoundException.class,
                () -> logic.move(Cell.C1, Cell.G5));
    }

    @Test
    public void whenOccupied()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new RookBlack(Cell.D2));
        OccupiedCellException exception = Assertions.assertThrows(OccupiedCellException.class,
                () -> logic.move(Cell.C1, Cell.G5));
    }

    @Test
    public void whenImpossibleMove()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new RookBlack(Cell.D2));
        ImpossibleMoveException exception = Assertions.assertThrows(ImpossibleMoveException.class,
                () -> logic.move(Cell.C1, Cell.G3));
    }
}
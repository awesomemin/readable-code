package cleancode.minesweeper.tobe.minesweeper.board.cell;

public interface Cell {

    boolean isLandMine();

    boolean hasLandMineCount();

    CellSnapshot getSnapshot();

    void toggleFlag();

    void open();

    boolean isChecked();

    boolean isOpened();

    boolean isFlagged();
}
package it.polimi.se2018.Model.ToolCards;

import it.polimi.se2018.Model.Board;
import it.polimi.se2018.Model.Moves.Move;

abstract public class ToolCard {
    private boolean alreadyUsed; //true if this tool card has already been used once
    private boolean usableAfterDraft; //true if this tool card is usable after placing a die
    private String imagePath;
    private String title;
    private Board board;

    protected ToolCard(String imagePath, String title, Board board) {
        this.imagePath=imagePath;
        this.title=title;
        alreadyUsed = false;
        this.board=board;
    }

    public void useCard(Move move) { //every specific tool card will implement this method differently
    }

}
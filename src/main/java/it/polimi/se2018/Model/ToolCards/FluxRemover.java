package it.polimi.se2018.Model.ToolCards;

import it.polimi.se2018.Controller.ToolCardHandler;
import it.polimi.se2018.Exceptions.DieException;
import it.polimi.se2018.Exceptions.NoDieException;
import it.polimi.se2018.Exceptions.ToolCardException;
import it.polimi.se2018.Model.Board;
import it.polimi.se2018.Network.Messages.Requests.ToolCardMessage;

public class FluxRemover extends ToolCard {

    public FluxRemover(String imagePath, String title, Board board, boolean alreadyUsed) {
        super(imagePath, title, board, alreadyUsed);
    }

    @Override
    public void handle(ToolCardHandler handler, ToolCardMessage message) throws ToolCardException{
        handler.useCard(this, message);
    }

    @Override
    public ToolCard setAlreadyUsed() {
        return null;
    }
}
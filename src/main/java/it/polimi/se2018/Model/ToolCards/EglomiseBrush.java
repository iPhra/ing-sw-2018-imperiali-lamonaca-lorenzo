package it.polimi.se2018.Model.ToolCards;

import it.polimi.se2018.Controller.ToolCardHandler;
import it.polimi.se2018.Exceptions.InvalidPlacementException;
import it.polimi.se2018.Exceptions.NoDieException;
import it.polimi.se2018.Exceptions.ToolCardException;
import it.polimi.se2018.Model.Board;
import it.polimi.se2018.Model.Die;
import it.polimi.se2018.Network.Messages.Requests.ToolCardMessage;
import it.polimi.se2018.Model.PlacementLogic.DiePlacerNoColor;
import it.polimi.se2018.Model.Square;

public class EglomiseBrush extends ToolCard {

    public EglomiseBrush(String imagePath, String title, Board board, boolean alreadyUsed) {
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

package it.polimi.se2018.Model.ToolCards;

import it.polimi.se2018.Controller.ToolCardHandler;
import it.polimi.se2018.Exceptions.InvalidPlacementException;
import it.polimi.se2018.Exceptions.ToolCardException;
import it.polimi.se2018.Model.Board;
import it.polimi.se2018.Model.Die;


import it.polimi.se2018.Model.PlacementLogic.DiePlacerNoValue;
import it.polimi.se2018.Model.Square;
import it.polimi.se2018.Network.Messages.Coordinate;
import it.polimi.se2018.Network.Messages.Requests.ToolCardMessage;

public class TapWheel extends ToolCard {

    public TapWheel(String imagePath, String title, Board board, boolean alreadyUsed) {
        super(imagePath, title, board,alreadyUsed);
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


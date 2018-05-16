package it.polimi.se2018.model.toolcards;

import it.polimi.se2018.controller.ToolCardHandler;
import it.polimi.se2018.network.messages.Coordinate;
import it.polimi.se2018.utils.exceptions.ToolCardException;
import it.polimi.se2018.network.messages.requests.ToolCardMessage;
import it.polimi.se2018.view.CLI.CLIClientView;

public class RunningPliers extends ToolCard {

    public RunningPliers(String imagePath) {
        super(imagePath, "Running Pliers", "After your first turn, immediately draft a die");
    }

    @Override
    public void handle(ToolCardHandler handler, ToolCardMessage message) throws ToolCardException{
        handler.useCard(this, message);
    }
    public ToolCardMessage getPlayerRequests(int playerID, CLIClientView clientView, int toolcardnumber) {
        ToolCardMessage toolCardMessage = new ToolCardMessage(playerID, toolcardnumber);
        return  toolCardMessage;
    }
}


package it.polimi.se2018.client.view.gui.button;

import it.polimi.se2018.client.view.gui.button.buttoncheckusability.ButtonCheckUsabilityHandler;


public class ButtonPass extends ButtonGame{
    private final int playerID;
    private Boolean usable;

    public ButtonPass(int playerID) {
        this.playerID = playerID;
        disarm();
    }

    @Override
    public void checkCondition(ButtonCheckUsabilityHandler handler){
        usable = handler.checkUsability(this);
        if(usable) arm();
        else disarm();
    }
}

package it.polimi.se2018.Controller;

import it.polimi.se2018.Exceptions.ToolCardException;
import it.polimi.se2018.Model.ToolCards.*;
import it.polimi.se2018.Network.Messages.Requests.ToolCardMessage;

public interface ToolCardHandler {

    void useCard(CopperFoilBurnisher toolCard, ToolCardMessage toolCardMessage) throws ToolCardException;

    void useCard(CorkBackedStraightedge toolCard, ToolCardMessage toolCardMessage) throws ToolCardException;

    void useCard(EglomiseBrush toolCard, ToolCardMessage toolCardMessage) throws ToolCardException;

    void useCard(FluxBrush toolCard, ToolCardMessage toolCardMessage) throws ToolCardException;

    void useCard(FluxRemover toolCard, ToolCardMessage toolCardMessage) throws ToolCardException;

    void useCard(GlazingHammer toolCard, ToolCardMessage toolCardMessage);

    void useCard(GrindingStone toolCard, ToolCardMessage toolCardMessage) throws ToolCardException;

    void useCard(GrozingPliers toolCard, ToolCardMessage toolCardMessage) throws ToolCardException;

    void useCard(Lathekin toolCard, ToolCardMessage toolCardMessage) throws ToolCardException;

    void useCard(LensCutter toolCard, ToolCardMessage toolCardMessage) throws ToolCardException;

    void useCard(RunningPliers toolCard, ToolCardMessage toolCardMessage) throws ToolCardException;

    void useCard(TapWheel toolCard, ToolCardMessage toolCardMessage) throws ToolCardException;

}

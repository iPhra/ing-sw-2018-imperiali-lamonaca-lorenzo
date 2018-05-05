package it.polimi.se2018.Model.PlaceDie;

import it.polimi.se2018.Model.Die;
import it.polimi.se2018.Model.Map;
import it.polimi.se2018.Model.Messages.Coordinate;

public class PlaceDieAlone extends PlaceDie {
    public PlaceDieAlone (Die die, Coordinate coordinate, Map map) {
        super();
        this.die = die;
        this.coordinate = coordinate;
        this.map = map;
        this.square = map.getSquare(coordinate.getRow(),coordinate.getCol());
    }

    @Override
    public boolean checkCondition() {
        return square.isEmpty() && square.sameColor(die) && square.sameValue(die) && isValueOk() && isColorOk();
    }
}

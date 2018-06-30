package it.polimi.se2018.mvc.model.objectives.publicobjectives;

import it.polimi.se2018.MapDatabase;
import it.polimi.se2018.mvc.model.Color;
import it.polimi.se2018.mvc.model.Window;
import it.polimi.se2018.mvc.model.Player;
import it.polimi.se2018.mvc.model.Square;
import it.polimi.se2018.mvc.model.objectives.privateobjectives.ShadesOfGreenObjective;
import it.polimi.se2018.utils.WindowBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMediumShadesObjective {
    private Square[][] matrix;
    private MapDatabase mapDatabase;
    private MediumShadesObjective mediumShadesObjective;
    private ShadesOfGreenObjective shadesOfGreenObjective;
    private Player player;

    @Before
    public void init(){
        mapDatabase = new MapDatabase();
        mapDatabase.standardWhiteMatrix();
        matrix = mapDatabase.getMatrix();
        mediumShadesObjective = MediumShadesObjective.instance("imagePath");
        mediumShadesObjective = MediumShadesObjective.instance("imagePath");
        Window window = new Window("BasicMap",0, matrix, WindowBuilder.getLevelPaths().get(0));
        shadesOfGreenObjective= ShadesOfGreenObjective.instance("imagePath");
        player = new Player("name",1, window,shadesOfGreenObjective);
    }

    @Test
    public void testEvalPoints(){
        assertEquals(0, mediumShadesObjective.evalPoints(player));
        mapDatabase.sixSameColoredDice(Color.GREEN);
        matrix = mapDatabase.getMatrix();
        Window window1 = new Window("sixSameColoredDiceMap",0, matrix,WindowBuilder.getLevelPaths().get(0));
        player = new Player("name",1, window1,shadesOfGreenObjective);
        assertEquals(2, mediumShadesObjective.evalPoints(player));
        mapDatabase.initMatrixFullOfDice();
        matrix = mapDatabase.getMatrix();
        Window window2 = new Window("FullOfDiceMap",0, matrix,WindowBuilder.getLevelPaths().get(0));
        player = new Player("name",1, window2,shadesOfGreenObjective);
        assertEquals(6, mediumShadesObjective.evalPoints(player));
    }
}

package it.polimi.se2018.Model;

import it.polimi.se2018.Model.Objectives.PublicObjectives.PublicObjective;
import it.polimi.se2018.Exceptions.DieNotFoundException;
import it.polimi.se2018.Model.ToolCards.ToolCard;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Board {
    private static final int COLORSNUMBER = 5; //number of colors in the game, 5 in our instance
    private static final int DICENUMBER = 90; //number of dice in the game, 90 in our instance
    private static final int ROUNDSNUMBER = 10; //number of rounds in one game
    private final int id;
    private Round round;
    private final String imagePath;
    private final int playersNumber;
    private final ArrayList<Player> players; //contiene la mappa di ciascun giocatore
    private final DraftPool draftPool; //draft pool
    private final ToolCard[] toolCards; // sono le toolCards sulla board (il gioco prevede da regolamento che siano 3, ma noi lo facciamo parametrico e quindi estendibile)
    private final PublicObjective[] publicObjectives; //array che contiene le carte degli obbiettivi pubblici
    private final Bag bag; //ha il riferimento al sacchetto dei dadi
    private final RoundTracker roundTracker; //ha il riferimento al roundTracker

    public Board(int id, ArrayList<Player> players, String imagePath, ToolCard[] toolCards, PublicObjective[] publicObjectives) {
        this.players = players;
        this.imagePath = imagePath;
        this.id=id;
        this.playersNumber=players.size();
        ArrayList<Integer> playersId = new ArrayList(playersNumber);
        for (int i=0; i<players.size(); i++) {
            playersId.add(players.get(i).getId());
        }
        round = new Round(playersId);
        draftPool = new DraftPool();
        this.toolCards = toolCards;
        this.publicObjectives = publicObjectives;
        bag = new Bag(COLORSNUMBER, DICENUMBER);
        roundTracker = new RoundTracker(ROUNDSNUMBER);
    }

    public DraftPool getDraftPool() {
        return draftPool;
    }

    public Round getRound() {
        return round;
    }

    public Bag getBag() {
        return bag;
    }

    public RoundTracker getRoundTracker() {
        return roundTracker;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getImagePath() {
        return imagePath;
    }

    public ToolCard[] getToolCards() {
        return toolCards;
    }

    public PublicObjective[] getPublicObjectives() {
        return publicObjectives;
    }

    public int getId() {return id; }

    /*public void initDraftPool() {
        draftPool.fillDraftPool(bag.drawDice(playersNumber));
    }

    public void endRound() {
    }*/

}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Board for Triples
 * 
 * BrittneyHung
 * 1/9/2025
 */
public class GameBoard extends World
{
    private final int NUM_CARDS_IN_DECK = 27;
    
    public GameBoard()
    {   
        super(430, 600, 1, false); 
        new Tester("Scorekeeper");
    }

}

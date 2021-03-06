package models;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/3/17.
 */
public class BlackJackTest {
    @Test
    public void newBlackjack_Instantiate() {
        BlackJack blackJack = new BlackJack();
        assertEquals(true, blackJack instanceof BlackJack);
    }

//    @Test
//    public void newBlackJack_DeckOfCards(){
//        BlackJack blackJack = new BlackJack();
//
//
//
//        assertEquals("Ace of Spades", blackJack.SingleCard());
//    }

    @Test
    public void newBlackjack_dealerWinsFirstRound() {
        BlackJack blackJack = new BlackJack();
        assertEquals(true, blackJack.playerHandCount(21));
    }

    @Test
    public void newBlackjck_drawRandomCardFromCurrentDeck() throws Exception {
        BlackJack blackJack = new BlackJack();
        assertEquals("", blackJack.randomCardSelection());
    }

    @Test
    public void newBlackjack_drawSceondCard() throws Exception {
        BlackJack blackJack = new BlackJack();
        assertEquals(51, blackJack.randomCardSelection());
    }
}
/**
 * Write a description of class WS03E here.
 *
 * @author Andrew
 * @version 2019
 */

import java.util.Random;

public class WS03E
{
    final static short SPADE = 0;
    final static short HEART = 1;
    final static short DIAMOND = 2;
    final static short CLUB = 3;
    final static short ACE_VAL = 1;
    final static short JACK_VAL = 11;
    final static short QUEEN_VAL = 12;
    final static short KING_VAL = 13;
    final static String ACE_STR = "A";
    final static String JACK_STR = "J";
    final static String QUEEN_STR = "Q";
    final static String KING_STR = "K";
    final static char SPADE_CHAR = '\u2660';
    final static char HEART_CHAR = '\u2665';
    final static char DIAMOND_CHAR = '\u2666';
    final static char CLUB_CHAR = '\u2663';
    
    public static void main (String[] args) {
        Random random_generator = new Random();
        
        int chosen_number = random_generator.nextInt(13) + 1;
        String chosen_number_str;
        int chosen_suit = random_generator.nextInt(4) + 1;
        char chosen_suit_char;
        
        switch (chosen_number) {
            case JACK_VAL:
                chosen_number_str = JACK_STR;
                break;
            case QUEEN_VAL:
                chosen_number_str = QUEEN_STR;
                break;
            case KING_VAL:
                chosen_number_str = KING_STR;
                break;
            case ACE_VAL:
                chosen_number_str = ACE_STR;
                break;
            default:
                chosen_number_str = Integer.toString(chosen_number);
        }
        
        switch (chosen_suit) {
            case SPADE:
                chosen_suit_char = SPADE_CHAR;
                break;
            case HEART:
                chosen_suit_char = HEART_CHAR;
                break;
            case DIAMOND:
                chosen_suit_char = DIAMOND_CHAR;
                break;
            case CLUB:
                chosen_suit_char = CLUB_CHAR;
                break;
            default:
                chosen_suit_char = '\0';
        }
        
        System.out.println("The playing card dealt is " + chosen_number_str + chosen_suit_char);
    }
}

/**
 * Represents a Dice with a face value
 * Allow the face value to be randomized(rolled)
 * Allow returning the current face value of the dice object
 * Allow casting integer face value to String and then returning it
 *
 * @author Haoye
 * @version 1573697644 
 */

public class Die {
    private int faceVal;

    /**
     * no parameter constructor of a dice instance and assigns a random value to the instance
     */
    public Die() {
        roll();
    }

    /**
     * no parameter accessor method to return the current face value of the dice object
     * @return face value of the dice object
     */
    public int getValue() {
        return faceVal;
    }

    /**
     * no parameter mutator method to assign a random value to faceVal, the face value of the dice object
     */
    public void roll() {
        faceVal = (int)(Math.random()*6) + 1;
    }

    /**
     * overridden toString method to convert integer face value of dice object into printable text(String)
     * @return the casted String value of faceVal, the face value of the dice object
     */
    @Override
    public String toString() {
        return "" + faceVal;
    }
}

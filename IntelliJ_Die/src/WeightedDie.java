/**
 * Represents a weighted dice and its face value
 * When this dice is rolled, it is twice as likely to get a even face value than an odd face value
 * Allow returning the current face value of the weighted dice object
 * Allow casting the integer face value into String and then returning it
 *
 * @author Haoye
 * @version 1573697644 
 */

public class WeightedDie {
    private int faceVal;

    /**
     * no parameter constructor of a weighted dice instance, and assigns a random value to the instance
     */
    public WeightedDie() {
        roll();
    }

    /**
     * no parameter accessor method to return the current face value of the weighted dice object
     * @return face value of the weighted dice object
     */
    public int getValue() {
        return faceVal;
    }

    /**
     * no parameter mutator method to assign a new weighted random value,
     * generates even numbers twice as likely as odd numbers
     */
    public void roll() {
        int prim = (int)(Math.random()*6) + 1;
        int index = (int)(Math.random()*3) + 1;
        if (prim % 2 == 0) {
            if (index == 1 || index == 2) faceVal = prim;
        } else if (prim % 2 != 0) {
            if (index == 3) faceVal = prim;
        }
    }

    /**
     * overridden toString method to convert integer face value of weighted dice object into printable text(String)
     * @return the casted String value of faceVal, the face value of the weighted dice object
     */
    @Override
    public String toString() {
        return "" + faceVal;
    }
}
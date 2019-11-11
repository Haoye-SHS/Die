/**
 * Represents a weighted dice which possess an even face value twice as likely as possessing an odd face value
 *
 * @author Haoye
 * @version 1573514106
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
        if (prim % 2 == 0) {
            faceVal = prim;
        } else {
            if ((int)(Math.random()*2) + 1 == 1) {
                faceVal = prim;
            }
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
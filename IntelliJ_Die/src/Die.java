public class Die {
    private int faceVal;

    public int getValue() {
        return faceVal;
    }

    public void roll() {
        faceVal = (int)(Math.random()*6);
    }

    @Override
    public String toString() {
        return String.valueOf(faceVal);
    }
}

public class ConcentrationException extends Exception {
    int c;

    public ConcentrationException(int c, String msg) {
        super(msg);
        this.c = c;
    }

    public int getC() {
        return c;
    }
}

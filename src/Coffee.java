public class Coffee {
    // props
    private int temp;
    private int conc;

    // constructor
    public Coffee(int temp, int conc) {
        this.temp = temp;
        this.conc = conc;
    }

    Coffee() {}

    // getters
    public int getTemp() {
        return temp;
    }

    public int getConc() {
        return conc;
    }

    @Override
    public String toString() {
        return "[tempereatura cafelei = "
                + temp + " concentratrie" + conc;
    }
}

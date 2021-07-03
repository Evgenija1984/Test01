package keyone.keytwo.test01;

public class Counters {

    private int counter_1;
    private int counter_2;

    public Counters() {
        counter_1 = 0;
        counter_2 = 0;

    }

    public int getCounter_1() {
        return counter_1;
    }

    public int getCounter_2() {
        return counter_2;
    }

    public void increaseCounter1() {
        counter_1++;
    }

    public void increaseCounter2() {
        counter_2++;
    }

}

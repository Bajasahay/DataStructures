package CodeStudio;

public class Trade {
    public Long tradeSolution(Long l) {
        Long value = 1l;
        int counter = 0;
        while(l>=2*value) {
            value = 2*value;
            counter++;
        }
        return counter+(l-powerCalculator(2,counter));
    }

    private int powerCalculator(int number, int power){
        while(power-1>0) {
            number = number*2;
            power = power-1;
        }
        return number;
    }
}

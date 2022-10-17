package bignited;

public class StringCalculator {

    String numberList;
    public StringCalculator(String numberList) {
        this.numberList = numberList;
    }

    public int calculate() {
        if (numberList.length() == 1) {
            return Character.getNumericValue(numberList.charAt(0));
        }
        return 0;
    }
}

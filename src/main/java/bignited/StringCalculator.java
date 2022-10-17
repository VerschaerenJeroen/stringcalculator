package bignited;

public class StringCalculator {

    private final String numberList;
    private String seperator = ",";
    private String numbersWithSeperator;

    public StringCalculator(String numberList) {
        this.numberList = numberList;
    }

    public int add() {
        if (isInputEmpty()) {
            return 0;
        }
        numbersWithSeperator = numberList;
        String[] inputSplittedBySeperator = splitInputBySeperator();
        return calculateSum(inputSplittedBySeperator);
    }

    private int calculateSum(String[] inputSplittedBySeperator) {
        int result = 0;
        for (String number : inputSplittedBySeperator) {
            result += addSingleNumber(number);
        }
        return result;
    }

    private int addSingleNumber(String number) {
        return Integer.parseInt(number);
    }

    private String[] splitInputBySeperator() {
        return numbersWithSeperator.split(seperator);
    }

    private boolean isInputEmpty() {
        return numberList.length() == 0;
    }
}

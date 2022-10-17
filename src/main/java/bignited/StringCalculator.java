package bignited;

public class StringCalculator {

    private final String numberList;
    private final String seperator = ",";
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

    private void throwExceptionIfNegativeTokensExist() {
        throw new IllegalArgumentException("numberNotAllowed");
    }

    private int addSingleNumber(String number) {
        Integer valueAsInteger = Integer.parseInt(number);
        if (isNegative(valueAsInteger)) {
            throwExceptionIfNegativeTokensExist();
        }
        return  valueAsInteger;
    }

    private String[] splitInputBySeperator() {
        return numbersWithSeperator.split(seperator);
    }

    private boolean isNegative(Integer valueAsInteger) {
        return valueAsInteger < 0;
    }

    private boolean isInputEmpty() {
        return numberList.length() == 0;
    }
}

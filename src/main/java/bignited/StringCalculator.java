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
        if (isCustomSeperator()) {
            seperator = String.valueOf(numbersWithSeperator.charAt(0));
            numbersWithSeperator = numbersWithSeperator.substring(1);
        }
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
        } else if (isInValidRange(valueAsInteger)) {
            return valueAsInteger;
        }
        return  0;
    }

    private String[] splitInputBySeperator() {
        return numbersWithSeperator.split(seperator);
    }

    private boolean isNegative(Integer valueAsInteger) {
        return valueAsInteger < 0;
    }

    private boolean isCustomSeperator() {
        return !Character.isDigit(numberList.charAt(0));
    }

    private boolean isInputEmpty() {
        return numberList.length() == 0;
    }

    private boolean isInValidRange(Integer valueAsInteger) {
        return valueAsInteger <= 1000;
    }
}

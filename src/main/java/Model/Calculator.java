package Model;

import java.util.OptionalInt;

public class Calculator
{
    private OptionalInt storedNumber = OptionalInt.empty();
    private Operation pendingOperation = null;

    public int add(int input)
    {
        return queueOperation(input, Operation.ADD);
    }
    public int subtract(int input) {
        return queueOperation(input, Operation.SUBTRACT);
    }
    public int multiply(int input) {
        return queueOperation(input, Operation.MULTIPLY);
    }
    public int divide(int input) {
        return queueOperation(input, Operation.DIVIDE);
    }
    public int square(int input) {
        storedNumber = OptionalInt.of(input);
        pendingOperation = Operation.SQUARE;
        applyOperation(input);
        return storedNumber.getAsInt();
    }
    public int sqrt(int input) {
        storedNumber = OptionalInt.of(input);
        pendingOperation = Operation.SQUARE_ROOT;
        applyOperation(input);
        return storedNumber.getAsInt();
    }

    public int equals(int input) {
        if (pendingOperation == null || storedNumber.isEmpty()) {
            return input;
        } else {
            applyOperation(input);
            return storedNumber.getAsInt();
        }
    }

    public void clear() {
        storedNumber = OptionalInt.empty();
        pendingOperation = null;
    }

    private int queueOperation(int input, Operation operation) {
        if (storedNumber.isEmpty()) {
            storedNumber = OptionalInt.of(input);
        } else {
            applyOperation(input);
        }
        pendingOperation = operation;
        return storedNumber.getAsInt();
    }

    private void applyOperation(int newInput) {
        if (pendingOperation == null || storedNumber.isEmpty()) {
            throw new RuntimeException();
        }
        int previousInput = storedNumber.getAsInt();
        int result = switch (pendingOperation) {
            case ADD -> previousInput + newInput;
            case SUBTRACT -> Math.max(previousInput - newInput, 0);
            case MULTIPLY -> previousInput * newInput;
            case DIVIDE -> previousInput / newInput;
            case SQUARE -> previousInput * previousInput;
            case SQUARE_ROOT -> (int)Math.sqrt(previousInput);
        };
        storedNumber = OptionalInt.of(result);
    }

}

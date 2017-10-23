package primitives;

public class MyNumber {

    private int number;

    public MyNumber(int number){
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof MyNumber) && (((MyNumber) obj).number == number);
    }

    public boolean isMultipleOf(int value) {
        return (this.number % value) == 0;
    }
}

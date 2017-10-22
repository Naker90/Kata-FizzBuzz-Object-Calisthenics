class MyNumber {

    private int number;

    MyNumber(int number){
        this.number = number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyNumber){
            return ((MyNumber) obj).number == number;
        }
        return false;
    }

    public boolean isMultipleOf(int value) {
        return (this.number % value) == 0;
    }
}

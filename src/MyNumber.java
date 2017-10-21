class MyNumber {

    private int number;

    MyNumber(int number){
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyNumber){
            return ((MyNumber) obj).number == number;
        }
        return false;
    }
}

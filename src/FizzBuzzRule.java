class FizzBuzzRule implements RulesInterface{
    @Override
    public boolean condition(MyNumber number) {
        if(number.isMultipleOf(15)){
            return true;
        }
        return false;
    }

    @Override
    public Object action() {
        return new MyString("FizzBuzz");
    }
}

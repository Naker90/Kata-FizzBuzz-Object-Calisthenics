public class FizzRule implements RulesInterface{
    @Override
    public boolean condition(MyNumber number) {
        if(number.isMultipleOf(3)){
            return true;
        }
        return false;
    }

    @Override
    public MyString action() {
        return new MyString("Fizz");
    }
}

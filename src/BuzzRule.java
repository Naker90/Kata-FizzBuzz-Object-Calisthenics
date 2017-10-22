public class BuzzRule implements RulesInterface{
    @Override
    public boolean condition(MyNumber number) {
        if(number.isMultipleOf(5)){
            return true;
        }
        return false;
    }

    @Override
    public MyString action() {
        return new MyString("Buzz");
    }
}

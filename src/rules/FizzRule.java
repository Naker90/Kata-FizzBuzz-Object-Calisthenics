package rules;

import primitives.MyBoolean;
import primitives.MyNumber;
import primitives.MyString;
import rules.RulesInterface;

public class FizzRule implements RulesInterface {
    @Override
    public MyBoolean condition(MyNumber number) {
        return new MyBoolean(number.isMultipleOf(3));
    }

    @Override
    public MyString action() {
        return new MyString("Fizz");
    }
}

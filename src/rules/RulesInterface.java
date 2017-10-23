package rules;

import primitives.MyBoolean;
import primitives.MyNumber;

public interface RulesInterface {
    MyBoolean condition(MyNumber number);
    Object action();
}

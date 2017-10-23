import primitives.MyBoolean;
import primitives.MyNumber;
import rules.RulesInterface;

import java.util.ArrayList;

public class RulesEngine {

    private ArrayList<RulesInterface> rulesEngine = new ArrayList<>();

    public void addRule(RulesInterface newRule){
        rulesEngine.add(newRule);
    }

    public Object executeRules(MyNumber number){
        for (RulesInterface rule : rulesEngine) {
            MyBoolean condition = rule.condition(number);
            if(condition.equals(new MyBoolean(true))){
                return rule.action();
            }
        }
        return number;
    }
}

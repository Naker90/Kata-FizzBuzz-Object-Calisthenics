import java.util.ArrayList;

class RulesEngine {

    private ArrayList<RulesInterface> rulesEngine = new ArrayList<>();

    void addRule(RulesInterface newRule){
        rulesEngine.add(newRule);
    }

    public Object fire(MyNumber number){
        for (RulesInterface rule : rulesEngine) {
            if(rule.condition(number)){
                return rule.action();
            }
        }
        return number;
    }
}

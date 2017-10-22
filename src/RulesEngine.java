import java.util.ArrayList;

public class RulesEngine {

    ArrayList<RulesInterface> rulesEngine = new ArrayList<>();

    void addRule(RulesInterface newRule){
        rulesEngine.add(newRule);
    }

    Object fire(MyNumber number){
        for(int i=0; i < rulesEngine.size(); i++){
            if(rulesEngine.get(i).condition(number)){
                return rulesEngine.get(i).action();
            }
        }
        return number;
    }

}

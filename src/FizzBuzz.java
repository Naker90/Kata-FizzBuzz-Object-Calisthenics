import primitives.MyNumber;
import rules.BuzzRule;
import rules.FizzBuzzRule;
import rules.FizzRule;

public class FizzBuzz {

    private RulesEngine rulesEngine = new RulesEngine();

    public FizzBuzz(){
        rulesEngine.addRule(new FizzBuzzRule());
        rulesEngine.addRule(new BuzzRule());
        rulesEngine.addRule(new FizzRule());
    }

    Object generate(MyNumber myNumber){
        return rulesEngine.fire(myNumber);
    }

}
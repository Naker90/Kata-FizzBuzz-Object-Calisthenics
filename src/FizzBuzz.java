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
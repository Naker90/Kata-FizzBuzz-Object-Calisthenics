public class FizzBuzz {

    private RulesInterface[] rulesEngine = new RulesInterface[3];

    public FizzBuzz(){
        rulesEngine[0] = new FizzBuzzRule();
        rulesEngine[1] = new FizzRule();
        rulesEngine[2] = new BuzzRule();
    }

    public Object generate(MyNumber myNumber){
        for(int i=0; i < rulesEngine.length; i++){
            if(rulesEngine[i].condition(myNumber)){
                return rulesEngine[i].action();
            }
        }
        return myNumber;
    }

}

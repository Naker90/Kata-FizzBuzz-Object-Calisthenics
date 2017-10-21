public class FizzBuzz {

    public Object generate(MyNumber myNumber){
        if(myNumber.isMultipleOf(5)){
            return new MyString("Buzz");
        }
        if(myNumber.isMultipleOf(3)){
            return new MyString("Fizz");
        }
        return myNumber;
    }

}

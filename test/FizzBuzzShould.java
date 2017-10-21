import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzShould {

    FizzBuzz fizzBuzz;

    @Before
    public void before(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void return_same_number_when_number_not_achieve_with_FizzBuzz_rules() throws Exception {
        MyNumber number = new MyNumber(1);
        assertThat(fizzBuzz.generate(number), is(number));
    }

    @Test
    public void return_Fizz_when_number_is_multiple_of_three() throws Exception {
        MyNumber number = new MyNumber(3);
        MyString string = new MyString("Fizz");
        assertThat(fizzBuzz.generate(number), is(string));
    }

    @Test
    public void return_Buzz_when_number_is_multiple_of_five() throws Exception {
        MyNumber number = new MyNumber(5);
        MyString string = new MyString("Buzz");
        assertThat(fizzBuzz.generate(number), is(string));
    }

    @Test
    public void return_FizzBuzz_when_number_is_multiple_of_three_and_five_simultaneously() throws Exception {
        MyNumber number = new MyNumber(15);
        MyString string = new MyString("FizzBuzz");
        assertThat(fizzBuzz.generate(number), is(string));
    }

}

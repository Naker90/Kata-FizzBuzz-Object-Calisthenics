import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzShould {

    @Test
    public void return_same_number_when_number_not_achieve_with_FizzBuzz_rules() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        MyNumber number = new MyNumber(1);
        assertThat(fizzBuzz.generate(number), is(number));
    }

    @Test
    public void return_Fizz_when_number_is_multiple_of_three() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        MyNumber number = new MyNumber(3);
        MyString string = new MyString("Fizz");
        assertThat(fizzBuzz.generate(number), is(string));
    }
}

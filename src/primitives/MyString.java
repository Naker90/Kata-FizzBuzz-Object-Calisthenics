package primitives;

public class MyString {

    private String string;

    public MyString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyString){
            return ((MyString) obj).string.equals(string);
        }
        return false;
    }
}

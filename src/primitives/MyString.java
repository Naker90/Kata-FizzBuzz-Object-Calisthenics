package primitives;

public class MyString {

    private String string;

    public MyString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof MyString) && (((MyString) obj).string.equals(string));
    }
}

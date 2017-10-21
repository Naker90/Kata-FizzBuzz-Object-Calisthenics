class MyString {

    private String string;

    MyString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyString){
            return ((MyString) obj).string.equals(string);
        }
        return false;
    }
}

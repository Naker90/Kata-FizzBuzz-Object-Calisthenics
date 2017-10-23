package primitives;

public class MyBoolean {

    private boolean bool;

    public MyBoolean(boolean bool){
        this.bool = bool;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof MyBoolean) && (((MyBoolean) obj).bool == bool);
    }
}


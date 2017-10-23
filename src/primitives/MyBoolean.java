package primitives;

public class MyBoolean {

    private boolean bool;

    public MyBoolean(boolean bool){
        this.bool = bool;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyBoolean){
            return ((MyBoolean) obj).bool == bool;
        }
        return false;
    }
}


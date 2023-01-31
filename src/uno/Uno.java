package uno;
public class Uno {//Choesion helps to convert card game to uno game.
    public enum Suit {RED,YELLOW,GREEN,BLUE};
    public enum Value{ZERO,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,SKIP,REVERSE, DRAWTWO, DRAWFOUR, WILDCARD};
    private Suit S;
    private Value v;  
    public Uno(Suit s, Value v){
        this.S=s;
        this.v=v;
    }
    public Suit getS() {
        return S;
    }
    public void setS(Suit S) {
        this.S = S;
    }
    public Value getV() {
        return v;
    }
    public void setV(Value v) {
        this.v = v;
    }
    
}

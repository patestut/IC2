package uno;

public class GenerateCard {

    private int size = 60;
    Uno[] deck = new Uno[size];

    public void generate() {
        int c = 0;
        for (Uno.Suit s : Uno.Suit.values())
        {
            for (Uno.Value v : Uno.Value.values()) {
                 deck[c]= new Uno(s,v);
                 c++;
            }
        }
    }
}

package uno;


public class PrintCards {
      public static void main(String[] args) {
        //print 60 cards
        
        GenerateCard ins=new GenerateCard();
        ins.generate();
        for(Uno c : ins.deck){ 
            System.out.println(c.getS() +" "+c.getV()); 
     }
    }
}

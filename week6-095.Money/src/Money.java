
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        int euroSum = this.euros + added.euros;
        int centSum = this.cents + added.cents;
        
            if (centSum >99) {
            centSum -=100;
            euroSum++;
        }
            
            return new Money(euroSum,centSum);
    }
    
    public boolean less(Money compared){
          return (100 * euros + cents) < (100 * compared.euros() + compared.cents());
    }
    
    public Money minus(Money decremented){
        int euroSum = this.euros - decremented.euros;
        int centSum = this.cents - decremented.cents;
        
        if (centSum < 0) {
            centSum+=100;
            euroSum--;
            
        }
        
        if (euroSum <0) {
            return new Money(0,0);
        }
        
        return new Money(euroSum,centSum);
    }

}

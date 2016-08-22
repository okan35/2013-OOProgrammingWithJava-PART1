
public class CashRegister {

    private double cashInRegister;   // the amount of cash in the register
    private int economicalSold;      // the amount of economical lunches sold
    private int gourmetSold;         // the amount of gourmet lunches sold
    private static final double PRICE_OF_ECONOMICAL = 2.5;
    private static final double PRICE_OF_GOURMET = 4.00;
    
    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        
        if (cashGiven >= PRICE_OF_ECONOMICAL) {
            this.cashInRegister += PRICE_OF_ECONOMICAL;
            this.economicalSold++;
            return cashGiven - PRICE_OF_ECONOMICAL;
        } else {
            return cashGiven;
        }

    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
    
        if (cashGiven >= PRICE_OF_GOURMET) {
            this.cashInRegister += PRICE_OF_GOURMET;
            this.gourmetSold++;
            return cashGiven - PRICE_OF_GOURMET;
        } else {
            return cashGiven;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    public boolean payEconomical(LyyraCard card) {
         // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= PRICE_OF_ECONOMICAL) {
            this.economicalSold++;
            card.pay(PRICE_OF_ECONOMICAL);
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= PRICE_OF_GOURMET) {
            this.gourmetSold++;
            card.pay(PRICE_OF_GOURMET);
            return true;
        } else {
            return false;
        }
        
        
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
            
        } else {
            return;
        }
        
        
        
    }
}

public class CreditAccount{
    private int limit;
    private int balance;
    private Person owner;
    private static long nextid;
    private long id;
    private static int defaul_limit;

    public CreditAccount(Person p){
        this.limit = CreditAccount.defaul_limit;
        this.owner = p;
        this.id = CreditAccount.nextid++;
        this.balance = 0;
    }
    /*private static long getNextid(){
        throw new RuntimeException("No more ids!");
        //CreditAccount.nextid = CreditAccount.nextid++;
        return CreditAccount.nextid++;
    }*/
    public int deposit(int amount){
        if(amount <= 0)throw new RuntimeException("invalid amount");
        this.balance = this.balance + amount;
        return this.balance;
    }
    public int withdraw(int amount){
        if(amount <= 0)throw new RuntimeException("invalid amount");
        this.balance = this.balance - amount;
        if(this.balance < this.limit)
        {   this.balance = this.balance + amount;
            throw new RuntimeException("invalid operation");
        }
        return this.balance;
    }
    public void setLimit(int limit){
        if(this.balance < limit) throw new RuntimeException("invalid amount");
        this.limit = limit;
    }
}
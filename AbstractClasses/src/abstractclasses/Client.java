package abstractclasses;

public class Client extends Human implements IOperations{
    private int balance;
    public Client(String name, int balance) {
        super(name);
        this.balance=balance;
    }

    @Override
    void Display() {
        System.out.println("Name "+GetName()+"\tBalance="+this.balance);
    }

    @Override
    public void Add(int sum) {
       this.balance+=sum;
       Display();
    }

    @Override
    public void Remove(int sum) {
        if(this.balance-sum>=0){
            this.balance-=sum;
            Display();
        }
        else{
            System.out.println("Error, not enoght money");
        }
    }
      
}

package collections;

public class Client extends Person{
    
    private double Bill;
    public Client(String name, int age, double bill) throws Exception {
        super(name, age);
        if(bill<0)throw new Exception("Балынс счта не может быть отридательным");
        Bill=bill;
    }
    public double getBill(){return Bill;}
    
    public void AddMoney(double money){Bill+=money;}
    public void RemoveMoney(double money)throws Exception {
        if(Bill-money>0)Bill-=money;
        else throw new Exception("Недостаточно средств на счёте.");
    }    
    @Override
     public String display(){
        return "ID "+getID()+"\t Name "+getName()+ "\tAge "+getAge()+
                "\tBalance "+Bill;
    }
}

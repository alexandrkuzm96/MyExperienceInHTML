package collections;

public class Employeers extends Person{
    private String Company;

    public Employeers(String name, int age, String company) throws Exception {
        super(name, age);
        Company=company;
    }
    public String getCompany(){return Company;}
    public void setCompany(String company){
        Company=company;
    }
    @Override
     public String display(){
        return "ID "+getID()+"\t Name "+getName()+ "\tAge "+getAge()+
                "\tCompany "+Company;
    }
}

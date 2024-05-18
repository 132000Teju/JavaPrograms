package EncapsulationTest;

public class Bank {
    private String name;
    private long accno;
    private float amount;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getAccno(){
        return accno;
    }
    public void setAccno(long accno){
        this.accno = accno;
    }

    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }
}
class Account{
    public static void main(String[] args){
        Bank obj = new Bank();
        obj.setName("Aaru");
        System.out.println(obj.getName());
        obj.setAccno(1234567890);
        System.out.println(obj.getAccno());
        obj.setAmount(100000);
        System.out.println(obj.getAmount());
    }
}

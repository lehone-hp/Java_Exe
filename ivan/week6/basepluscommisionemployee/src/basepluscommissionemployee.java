
public class basepluscommissionemployee {
    private commissionemployee commissionemployee;
    private double baseSalary;
    public basepluscommissionemployee(String fn,String ln,String ssn,double gs,double cr,double bs){
        commissionemployee= new commissionemployee(fn,ln,ssn,gs,cr);
        if(bs<0.0)
            throw new IllegalArgumentException("Base salary should be >=0.0");
        baseSalary=bs;
    }
    public void setBaseSalary(double bs){
        baseSalary=bs;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    double earnings(){
        return getBaseSalary() + commissionemployee.earnings() ;
    }
    @Override
    public String toString(){
        return String.format("%s %s%n%s: %.2f","base-salaried",commissionemployee.toString(),"base salary",getBaseSalary());
        
    }
}

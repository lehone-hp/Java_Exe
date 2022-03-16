
public class commissionemployee {
    private final String firstname,lastname,socialSecurityNumber;
    private double grossSales,commissionRate;
    public commissionemployee(String fn,String ln,String ssn,double gs,double cr){
        if(gs<0.0)
            throw new IllegalArgumentException("Gross ssales must be >=0.0");
        if(cr<=0.0 ||cr>=1.0)
            throw new IllegalArgumentException("Commission rate should be> 0.0 and <1.0)");
        firstname=fn;
        lastname=ln;
        socialSecurityNumber=ssn;
        grossSales=gs;
        commissionRate=cr;
    }
    public String getFirstName(){
        return firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    public void setGrossSales(double gs){
        if(gs<0.0)
            throw new IllegalArgumentException("Gross sales should be >=0.0");
        grossSales=gs;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setCommissionRate(double cr){
        if(cr<=0.0 || cr>=1.0)
            throw new IllegalArgumentException("Commission rate should be >0.0 and <1.à");
        commissionRate=cr;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f","commission employee",getFirstName(),getLastName(),"social security number",getSocialSecurityNumber(),"gross sales",getGrossSales(),"commision rate",getCommissionRate());
    }
}

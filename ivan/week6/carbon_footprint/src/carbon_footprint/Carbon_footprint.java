/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carbon_footprint;

class building implements carbonfootprint {
    private int numpersons;
    private double efe,eff,ec,fc;
    building(int inhabitants,double electricityemmissionfactor,double fuelemmissionfactor,double electricalconsumption,double fuelconsumption){
        //nb the consumptions are per inhabitans
        if(inhabitants<0.0)
            throw new IllegalArgumentException("number of inhabitants should be >=0");
        if(electricityemmissionfactor<0.0)
            throw new IllegalArgumentException("electricity emmision factor should be >=0");
        if(fuelemmissionfactor<=0.0)
            throw new IllegalArgumentException("fuel emmission factor  should be >0");
        if(electricalconsumption<0 || fuelconsumption<0)
            throw new IllegalArgumentException("Energy should be >=0");
        numpersons=inhabitants;
        efe=electricityemmissionfactor;
        eff=fuelemmissionfactor;
        ec=electricalconsumption;
        fc=fuelconsumption;
    }
    building(){
        numpersons=0;
        efe=eff=ec=fc=0.0;
    }
    int getnumberofhabitants(){
        return numpersons;
    }
    void enteringhabitant(){
        numpersons++;
    }
    void enteringgroup(int a){
        numpersons+=a;
    }
    void leavinghabitant(){
        numpersons--;
    }
    void leavinggroup(int a){
        numpersons-=a;
    }
    double getEmmissionFactorE(){
        return efe;
    }
    void setEmmisionFactorE(double a){
        if(a<0.0)
            throw new IllegalArgumentException("electrical emmission factor should be >=0");
        efe=a;
    }
    double getElectricalConsumption(){
        return ec;
    }
    void inreaseElectricalConsumption(double a){
        if(a<0.0)
            throw new IllegalArgumentException("I don't think it is possible to unconsume electricity");
        ec+=a;
    }
    double getEmmissionFactorF(){
        return eff;
    }
    void setEmmisionFactorF(double a){
        if(a<=0.0)
            throw new IllegalArgumentException("Fuel emmission factor should be >0");
        eff=a;
    }
    double getFuelConsumption(){
        return fc;
    }
    void inreaseFuelConsumption(double a){
        if(a<0.0)
            throw new IllegalArgumentException("I don't think it is possible to unconsume fuel");
        fc+=a;
    }
    @Override
    public double getCarbonfootprint(){
        return numpersons*((efe*ec)+(eff*fc));
    }
}

class car implements carbonfootprint{
    private double efe,eff,ec,fc,dt;
    car(double distancetravelled,double electricityemmissionfactor,double fuelemmissionfactor,double electricalconsumption,double fuelconsumption){
        if(distancetravelled<0.0)
            throw new IllegalArgumentException("distance travelled should be>=0");
        if(electricityemmissionfactor<0.0)
            throw new IllegalArgumentException("electricity emmision factor should be >=0");
        if(fuelemmissionfactor<=0.0)
            throw new IllegalArgumentException("fuel emmission factor  should be >0");
        if(electricalconsumption<0 || fuelconsumption<0)
            throw new IllegalArgumentException("Energy should be >=0");
        dt=distancetravelled;
        efe=electricityemmissionfactor;
        eff=fuelemmissionfactor;
        ec=electricalconsumption;
        fc=fuelconsumption;
    }
    car(){
        efe=eff=ec=fc=dt=0.0;
    }
    void increaseDistanceTravelled(double a){
        if(a<0.0)
            throw new IllegalArgumentException("Distance travelled cannot reduce ");
        dt+=a;
    }
    double getDistanceTravelled(){
        return dt;
    }
    double getEmmissionFactorE(){
        return efe;
    }
    void setEmmisionFactorE(double a){
        if(a<0.0)
            throw new IllegalArgumentException("electrical emmission factor should be >=0");
        efe=a;
    }
    double getElectricalConsumption(){
        return ec;
    }
    void inreaseElectricalConsumption(double a){
        if(a<0.0)
            throw new IllegalArgumentException("I don't think it is possible to unconsume electricity");
        ec+=a;
    }
    double getEmmissionFactorF(){
        return eff;
    }
    void setEmmisionFactorF(double a){
        if(a<=0.0)
            throw new IllegalArgumentException("Fuel emmission factor should be >0");
        eff=a;
    }
    double getFuelConsumption(){
        return fc;
    }
    void inreaseFuelConsumption(double a){
        if(a<0.0)
            throw new IllegalArgumentException("I don't think it is possible to unconsume fuel");
        fc+=a;
    }
    @Override
    public double getCarbonfootprint(){
        return (ec*efe)+(fc*eff);
    }       
}

class bycicle implements carbonfootprint{
    final private double efh,efe;
    private double dt;
    bycicle(double distancetravelled,double emmissionfactor){
       if(emmissionfactor<0)
           throw new IllegalArgumentException("The emmission factor should be >=0");
       if(distancetravelled<0)
           throw new IllegalArgumentException("The distance travelled should be >=0");
        efe=emmissionfactor;
        dt=distancetravelled;
        efh=0.5;
    }
    bycicle(double distancetravelled){
        if(distancetravelled<0.0)
            throw new IllegalArgumentException("The distance travelled should be >=0.0");
        dt=distancetravelled;
        efe=0.0;
        efh=1;
    }
    bycicle(){
        efe=dt=0.0;
        efh=1;
    }
    double getDistanceTravelled(){
        return dt;
    }
    double getHumanEmmissionFactor(){
        return efh;
    }
    double getElectricalEmmisionFactor(){
        return efe; 
    }
    void increaseDistanceTravelled(double a){
        if(a<0.0)
            throw new IllegalArgumentException("I don't think you can cover negative distances");
        dt+=a;
    }
    @Override
    public double getCarbonfootprint(){
        return dt*(efe+efh);
    }
}

public class Carbon_footprint {
    
    public static void main(String[] args) {
        building build=new building(5,2,3,500,400);
        car ca=new car(60,2,3,50,60);
        bycicle bi=new bycicle(5);
        carbonfootprint carbin[]=new carbonfootprint[3];
        carbin[0]=build;
        carbin[1]=ca;
        carbin[2]=bi;
        for(int i=0;i<3;i++)
            System.out.printf( "%f\n",carbin[i].getCarbonfootprint());
    }
    
}

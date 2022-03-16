
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package target_heart_rate_calculator;
import java.util.* ;

class heartrates{
    private String fn,ln;
    private int mb,db,yb;
    heartrates(String first,String last,int month,int day,int year){
        fn=first;
        ln=last;
        mb=month;
        db=day;
        yb=year;
    }    
    heartrates(){
        fn=ln="Paul";
        mb=db=yb=1;
    }
    String getfirstname(){
        return fn;
    }
    void setfirstname(String name){
        fn=name;
    }
    String getlastname(){
        return ln;
    }
    void setlastname(String name){
        ln=name;
    }
    int getdob(){
        return db;
    }
    void setdob(int num){
        if(mb==9 || mb== 4 || mb==6 || mb==10)
            if(num>0 && num <=30)
                db=num;
            else{
                db=1;
                System.out.printf("Invalid data, value reset to default\n");
            }
        else if(mb==2)
            if((yb%4)==0)
                if(num>0 && num<=29)
                    db=num;
                else{
                    System.out.printf("invalid data, value reset to default\n");
                    db=1;
                }
            else
                if(num>0 && num <=28)
                    db=num;
                else{
                    System.out.printf("Invalid data, value reset to default\n");
                }
        else
            if(num>0 && num<=31)
                db=num;
            else
                System.out.printf("Invalid data, value reset to default\n");
    }
    int getmob(){
        return mb;
    }
    void setmob(int num){
        if(num>0 && num<=12)
            mb=num;
        else{
            System.out.printf("invalid data, value reset to default\n");
            mb=1;
        }
    }
    int getyob(){
        return yb;
    }
    void setyob(int num){
        yb=num;
    }
    int[] getbirthday(){
        int a[]=new int[3];
        a[0]=mb;
        a[1]=db;
        a[2]=yb;
        return a;
    }
    int getage(int mon,int day,int year){
        if(mb<=mon && db<=day)
            return year-yb;
        else
            return year-yb-1; 
    }
    int maxheartrate(int mon,int day,int year){
        return 220-getage(mon,day,year);
    }
    float[] targetheartrate(int mon,int day,int year){
        float a[]= new float[2];
        a[0]=maxheartrate(mon,day,year)*50/100;
        a[1]=maxheartrate(mon,day,year)*85/100;
        return a;
    }
}


/**
 *
 * @author Ergo3.0
 */
public class Target_heart_rate_calculator {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        heartrates ivan=new heartrates();
        Date today=new Date();
        Scanner input=new Scanner(System.in);
        System.out.printf("whats your first name : ");
        ivan.setfirstname(input.nextLine());
        System.out.printf("whats your last name : ");
        ivan.setlastname(input.nextLine());
        System.out.printf("whats your month of birth : ");
        ivan.setmob(input.nextInt());
        System.out.printf("whats your day of birth : ");
        ivan.setdob(input.nextInt());
        System.out.printf("whats your year of birth : ");
        ivan.setyob(input.nextInt());
        System.out.printf("name : %s %s\nage : %d\nMax heart rate : %d\nTarget heart rate : %.0f-%.0f",ivan.getfirstname(),ivan.getlastname(),ivan.getage(today.getMonth(),today.getDay(),today.getYear()+1900),ivan.maxheartrate(today.getMonth(),today.getDay(),today.getYear()+1900),ivan.targetheartrate(today.getMonth(),today.getDay(),today.getYear()+1900)[0],ivan.targetheartrate(today.getMonth(),today.getDay(),today.getYear()+1900)[1]);
    }
    
}

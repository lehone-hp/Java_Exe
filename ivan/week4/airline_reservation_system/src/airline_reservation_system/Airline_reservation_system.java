/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline_reservation_system;
import java.util.*;

public class Airline_reservation_system {
    static int firstseat(Boolean[] a){
        Scanner input=new Scanner(System.in);
        int i=0;
        while(a[i] && (i<5))
            i++;
        if(i==5){
            System.out.printf("no more seats in first class\ncan you take a seat in eco(1 for yes 2 for no):");
            int b=input.nextInt();
            switch(b){
                case 1:
                    return secondseat(a);
                default :
                    System.out.printf("next flight leaves in three hours\n");
            }
            return 0;
        }
        a[i]=true;
        return (i+1);
    }
    static int secondseat(Boolean[] a){
        Scanner input=new Scanner(System.in);
        int i=5;
        while(a[i] && (i<10))
            i++;
        if(i==10){
            System.out.printf("no more seats in eco class\ncan you take a seat in eco(1 for yes 2 for no):");
            int b=input.nextInt();
            switch(b){
                case 1:
                    return firstseat(a);
                default :
                    System.out.printf("next flight leaves in three hours\n");
            }
            return 0;
        }
        a[i]=true;
        return (i+1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=0,b=0;
        Boolean seats[]=new Boolean[10];
        for(int i=0;i<10;i++)
            seats[i]=false;
        while(!seats[4] || !seats[9] ){
            System.out.printf("Select seat type (1 for first 2 for eco) : ");
            a=input.nextInt();
            if(a==1)
                b=firstseat(seats);
            else if(a==2)
                b=secondseat(seats);
            else
                break;
            if(b>=6)
                System.out.printf("seat :%d\nsection : economy\n",b);
            else if(b>0)
                System.out.printf("seat :%d\nsection : first class\n",b);
        }
        System.out.printf("Plane is full. Next flight in three hours.");
    }
    
}

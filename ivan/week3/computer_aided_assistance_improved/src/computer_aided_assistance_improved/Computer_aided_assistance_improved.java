/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer_aided_assistance_improved;

import java.util.* ;
import java.security.* ;

public class Computer_aided_assistance_improved {
    static int[] questionaire(int n){
        SecureRandom rand=new SecureRandom();
        int d=1,c[]=new int[3];
        for(int i=0;i<n;i++)
            d*=10;
        int a=rand.nextInt(d),b=rand.nextInt(d);
        System.out.printf("%d * %d = ",a,b);
        c[0]=a;
        c[1]=b;
        c[2]=a*b;
        return c;
    }
    
    static void congrats(){
        SecureRandom rand=new SecureRandom();
        int a=rand.nextInt(4);
        switch(a){
            case 0:
                System.out.printf("you're good keep on !\n");
                break;
            case 1:
                System.out.printf("let's all bow before the math king!\n");
                break;
            case 2:
                System.out.printf("that's great!!!\n");
                break;
            case 3:
                System.out.printf("keep that pace!\n");
                break;
        }
    }
    static void sosad(){
        SecureRandom rand=new SecureRandom();
        int a=rand.nextInt(4);
        switch(a){
            case 0:
                System.out.printf("you suck at this! just give a right answer. please!!!\n");
                break;
            case 1:
                System.out.printf("dumbass, please call a friend to help you out.\n");
                break;
            case 2:
                System.out.printf("you are wrong. try harder next time.\n");
                break;
            case 3:
                System.out.printf("keep on trying.you'll get it right the next time\n");
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int l;
        Scanner scanner=new Scanner(System.in);
        System.out.printf("please select a dificulty leve(from 1 to 5) :");
        l=scanner.nextInt();
        System.out.printf("the game will start you may enter -1 to quit\n");
        while(true){
            int a[]=questionaire(l);
            int b=scanner.nextInt();
            if(b==-1)
                break;
            while(b!=a[2]){
                sosad();
                System.out.printf("%d * %d = ",a[0],a[1]);
                b=scanner.nextInt();
            }
            congrats();
        }
        // TODO code application logic here
    }
    
}
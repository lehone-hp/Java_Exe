/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer_aided_assistance;
import java.util.* ;
import java.security.* ;
public class Computer_aided_assistance {
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
                System.out.printf("wrong answer try again\n");
                System.out.printf("%d * %d = ",a[0],a[1]);
                b=scanner.nextInt();
            }
            System.out.printf("correct answer \n");
        }
        // TODO code application logic here
    }
    
}

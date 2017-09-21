/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalwarming;
import java.util.* ;

/**
 *
 * @author Ergo3.0
 */
public class Globalwarming {
    
    static int quiz(){
        Scanner input=new Scanner(System.in);
        int a=0,count=0;
        System.out.printf("question1\n1:A 2:B 3:C 4:D\n ans :");
        if(1==input.nextInt())
            count++;
        System.out.printf("question2\n1:A 2:B 3:C 4:D\n ans :");
        if(2==input.nextInt())
            count++;
        System.out.printf("question3\n1:A 2:B 3:C 4:D\n ans :");
        if(3==input.nextInt())
            count++;
        System.out.printf("question4\n1:A 2:B 3:C 4:D\n ans :");
        if(4==input.nextInt())
            count++;
        System.out.printf("question5\n1:A 2:B 3:C 4:D\n ans :");
        if(3==input.nextInt())
            count++;
        return count;
    }
    
    static void result(int a){
        switch(a){
            case 5:
                System.out.printf("Excellent !!");
                break;
            case 4:
                System.out.printf("Very good !");
                break;
            default:
                System.out.printf("need to brush up your skills on Global warming\n");
        }
    }    
    public static void main(String[] args) {
        int a;
        System.out.printf("Welcome to my stupid and boring game on global warming \n Ready or not we are starting\n");
        a=quiz();
        result(a);
        return;
    }
    
}

package complexer;

public class Complexer {
    public static void main(String[] args) {
        complex a=new complex(2,2),b=new complex(),c=new complex();
        c.printcomplex(a);
        System.out.printf("\n");
        c.printcomplex(b);
        System.out.printf("\n");
        b.setreal(10);
        b.setimaginary(5);
        c=c.add(a,b);
        c.printcomplex(c);
        System.out.printf("\n");
    }
    
}

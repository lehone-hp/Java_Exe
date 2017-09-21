package complexer;

public class complex {
    private float im,re;
    complex(){
        im=re=0;
    }
    complex(float a,float b){
        re=a;
        im=b;
    }
    void setimaginary(float a){
        im=a;
    }
    float getimaginary(){
        return im;
    }
    void setreal(float a){
        re=a;
    }
    float getreal(){
        return re;
    }
    complex add(complex a,complex b){
        return new complex(a.getreal()+b.getreal(),a.getimaginary()+b.getimaginary());
    }
    complex sub(complex a,complex b){
        return new complex(a.getreal()-b.getreal(),a.getimaginary()-b.getimaginary());
    }
    void printcomplex(complex a){
        System.out.printf("(%.0f,%.0f)",a.getreal(),a.getimaginary());
    }
}

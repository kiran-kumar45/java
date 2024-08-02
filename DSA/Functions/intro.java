package Functions;

public class intro {
    public static void printHelloWorld(){
        System.out.println("hello world");
    }
public static int multiply(int a,int b){
    int product=a*b;
    return product;
}
public static int factorial(int n){
    int f=1;
    for(int i=1;i<=n;i++)
    {
        f=f*i;
    }
    return f;

}
public static void main(String[] args) {
    // printHelloWorld(); 
    // int a=3;
    // int b=4;//multiply
    // int prod=multiply(a,b);
    // System.out.println(prod);
    System.out.println(factorial(4));

}
    
}

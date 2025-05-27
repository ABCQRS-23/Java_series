public class Number {
    public static void main(String[] args) {
        int num = 10; //considered integer
        //checked number is positive or negative
    if (num>0) {
        System.out.println("The number is positive");
    }
    else{
        System.out.println("The number is negative");
    }
    //displays even
    if(num%2== 0)
    {
        System.out.println("The number is even");
    }
    else{
        System.out.println("The number is odd");
    }
    //square 

    int squarenum = num * num;
    System.out.println("Square of the number is: "+squarenum);
    

    //factorial
    int fact = 1;
    for(int i = 1; i <= num;i++)
    {
        fact = fact * i;
        System.out.println("the factorial of the number is: "+fact);
    }


}
}
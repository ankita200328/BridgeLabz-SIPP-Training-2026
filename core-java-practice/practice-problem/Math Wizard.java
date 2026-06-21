class Math Wizard {

    public boolean  isPrime(int n){
        if(n%)

    }
    public int factorial(int a){
      int   fact *= a


    }
    public int fibbonacci(int n){
        for(int i=0;i<n;i++){
            int temp=a+b;

        }

    }
    public double fibbonacci(double n){

    }
    public int GCD(int n){
        int temp=b;
        b=b%a;
        a=temp;
    }
    public int LCM(int n){
        a*b/GCD(a,b)
    }


    public static void mian(String[]args){
        Math Wizard cal=new Math Wizard();
        System.out.println("1.isPrime\n 2.factorial\n3.fibbonacci\n4.fibbonacci\n5.GCD\n6.LCM");
        Scanner sc = new Scanner (System.in);
        int choice = sc.nextInt();
        System.out.println("enter a number");
        switch(choice){
            case 1: boolean prime=cal.isPrime();
            System.out.println(prime);
            break;
            case 2: int fact=cal.factorial();
            System.out.println(fact);
            break;
            case 3: int fibbo= cal.fibbonacci();
            System.out.println(fibbo);
            break;
            case 4: double fact2=cal.fibbonacci();
            System.out.println(fact2);
            break;
            case 5 int Gcd=cal.GCD();
            System.out.println(Gcd);
            break;
            case 6: lc=cal.LCM();
            System.out.println(lc);
        }


    }
}
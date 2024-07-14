public class Pattern {
    public static void main(String[] args) {
        // System.out.println();
        // int n=9;
        // for (int i = 0; i <n; i++) {
        // for (int j = 0; j < n; j++) {
        // if(j>=n-i+1){
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // a>b
        // b>c
        // c>a
        int a = 10, b = 20, c = 30;
        int temp = a;
        a = c;
        c = b;
        b = temp;
        System.out.println("a=" + a + "b=" + b + "c=" + c);
        int nr = 45,rem=0;
        String res="";
        while (nr != 0) {
            rem=nr%2;
            res=rem+res;
            nr=nr/2;
        }
        System.out.println(Integer.parseInt(res));
        int bin = 101101;
        double i=0.0,dec=0;
        
        while(bin!=0){
            rem=bin%10;
            dec+=rem*Math.pow(2.0,i);
            i++;
            bin=bin/10;
        }
        System.out.println(dec);
        int nmr = 6575647,sum=0,count=0;
        while(nmr!=0){
            rem=nmr%10;
            System.out.println(rem);
            sum=sum+rem;
            nmr = nmr/10;
            count++;
        }
        System.out.println(sum);
        System.out.println(count);

        System.out.println(45/10);
        System.out.println(Math.floor(Math.log10(12345))+1);
        System.out.println(Math.ceil(5.6)+"  "+ Math.floor(5.6));
    

    int test=25;
    for (int j = 2; j < test; j++) {
        if(test%j==0){
            System.out.println(j);
            break;
        }
    }
    String nm = "alok is a normal guy";
    String nm2 = nm.replaceAll("[AEIOUaeiou]","z");
    System.out.println(nm2);
}

    

   
}
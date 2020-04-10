/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing_assignment;


public class MyClass {
    
    public boolean primeNumber(int num){
        boolean isPrime=true;
        if(num<=1){
            return false;
        }
        else{
            for(int i=2; i<=num/2; i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        
        return isPrime;
    }
    
    public int factorial(int num){
        if(num<0)
            return -1;
        else{
        
            int fact = 1;
            for(int i = 1; i <= num; ++i)
            { 
                fact *= i;
            }
            return fact;
        }
    }
    
    public int LCM(int n1, int n2){
        int lcm;
        lcm = (n1 > n2) ? n1 : n2;
        while(true)
        {
            if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                break;
            }
            ++lcm;
        }
        return lcm;
    }
    
    public int GCD(int n1, int n2){
         int gcd = 1;
         
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
           
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }
        return gcd;
    }
}

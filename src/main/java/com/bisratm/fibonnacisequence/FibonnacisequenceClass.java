package com.bisratm.fibonnacisequence;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FibonnacisequenceClass {
    @RequestMapping("/")
    public static long fibonacci(int i) {
       int n = 5;
        long sum ;
        //int a[] = new int[n];


        sum = fibonacci(n - 1) + fibonacci(n - 2);

        System.out.println(sum);
        return sum;


    }


}


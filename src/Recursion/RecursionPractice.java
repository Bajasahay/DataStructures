package Recursion;

public class RecursionPractice {

    public void printNameNTimes(Integer n) {
        if(n ==0) {
            return;
        }else {
            System.out.println("Name");
            printNameNTimes(--n);
        }
    }

    public void printFromNto1(Integer n) {
        if(n==0) {
            return;
        } else {
            System.out.println(n);
            printFromNto1(n-1);
        }
    }

    public void sumOfFirstNNumbersCaller(Integer n) {
        System.out.println(sumOfFirstNNumbers(n));
    }

    public void factorialCaller(Integer n) {
        System.out.println(factorial(n));
    }

    public void arrayInverterCaller(int[] arr) {
        arrayInverter(arr,0);
        System.out.println(arr);
    }

    public void fibonacciCaller(int n) {
        System.out.println(fibonacci(n));
    }
    private Integer fibonacci(int n) {
        if(n==0) {
            return 0;
        } else if(n==1) {
            return 1;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    private void arrayInverter(int[] arr,int index) {
        if(index>=(arr.length/2)) {
            return;
        } else {
            int temp = arr[index];
            arr[index] = arr[arr.length-index-1];
            arr[arr.length-index-1] = temp;
            System.out.println(arr);
            arrayInverter(arr,index+1);
        }
    }

    private Integer factorial(Integer n) {
        if(n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }

    private Integer sumOfFirstNNumbers(Integer n) {
        if(n == 0) {
            return 0;
        }
        return n + sumOfFirstNNumbers(n-1);
    }
}

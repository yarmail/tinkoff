package tasks_2022.task2;

public class Test {
    public static void main(String[] args) {
        long n = 5;
        long m = 10;
        long count = 0;
        while ( n > 0 & m > 0){
            if (n > m){
                n -= m;
                ++count;
            }else {
                m -= n;
                ++count;
            }
        }
        System.out.println(count);
    }
}

package chapter2_Sort;

import java.util.Random;

/**
 * @Description:
 * @Create: 2019-12-24-15:29
 */
public class SortCompare {
    //调用各种排序方法
    public static double time(String alg,Double[] a){

        return 1.0;
    }
    //
    public static double timeRandomInput(String alg,int N,int T){
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++)
                a[i] = Math.random()*9;
            total += time(alg,a);
        }
        return 0.0;
    }
}

package chapter2_Sort;

/**
 * @Description:希尔排序，基于插入排序的快速排序算法
 * @Create: 2019-12-24-15:45
 */
public class Shell {
    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while (h < N/3) h = h * 3 + 1;
        while (h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && Example.less(a[j],a[j-h]); j -= h)
                    Example.exch(a,j,j-h);
            }
            h = h/3;
        }
    }
    public static void main(String[] args) {
        Integer[] a = {58,77,30,26,981,868,998,666,254,318};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}

package chapter2_Sort;

/**
 * @Description:这个还不错，可以写出来了
 * @Create: 2019-12-26-10:19
 */
public class Insertion_P_3 {
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >= 1 && Example.less(a[j],a[j-1]); j--)
                Example.exch(a,j,j-1);
        }
    }
    public static void main(String[] args) {
        Integer[] a = {58,77,30,26,981,868,998,666,254,318};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}

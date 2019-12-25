package chapter2_Sort;

/**
 * @Description:还不错，还算能写出来，冒泡有点像？？
 * @Create: 2019-12-25-21:17
 */
public class Insertion_P_2 {
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && Example.less(a[j],a[j-1]); j--)
                Example.exch(a,j,j-1);
        }
    }
}

package chapter2_Sort;

/**
 * @Description:不成功，不够熟悉
 * @Create: 2019-12-26-10:38
 */
public class QuickSort_P_2 {

    public static void sort(Comparable[] a) {
        int len;
        if(a == null || (len = a.length) == 0 || len == 1) return;
        quickSort(a, 0, a.length - 1);
    }

    public static void quickSort(Comparable[] a, int l, int r) {
        if(l >= r) return;
        int i = l;
        int j = r;
        Comparable base = a[l];

        while (i < j) {
            while (i < j && Example.less(base, a[j])) {
                j--;
            }
            while (i < j && Example.less(a[i], base)) {
                i++;
            }
            if (i < j) {
                Example.exch(a, i, j);
            }
        }
        quickSort(a, l, i - 1);
        quickSort(a, i + 1, r);
    }
    public static void main(String[] args) {
        Integer[] a = {58,77,30,26,981,868,998,666,254,318};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}

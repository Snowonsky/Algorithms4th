package chapter2_Sort;

/**
 * @Description:
 * @Create: 2019-12-25-16:55
 */
public class QuickSort {
    public static void quickSort(Comparable[] a) {
        int len;
        if (a == null || (len = a.length) == 0 || len == 1) {
            return;
        }
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int l, int r) {
        if (l >= r) return;
        Comparable base = a[l];
        int i = l;
        int j = r;
        while (i < j) {
            while (Example.less(base, a[j]) && i < j) {
                j--;
            }
            while (Example.less(a[i], base) && i < j) {
                i++;
            }
            if (i < j) Example.exch(a, i, j);
        }
        //Example.exch(a, l, i);
        sort(a, l, i - 1);
        sort(a, i + 1, r);
    }

    public static void main(String[] args) {
        Integer[] a = {58, 77, 30, 26, 981, 868, 998, 666, 254, 318};
        quickSort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}

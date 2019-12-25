package chapter2_Sort;

/**
 * @Description:希尔排序自写练习第1次，未完成
 * @Create: 2019-12-25-14:59
 */
public class Shell_P_1 {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int gap = 1;
        while (gap < N / 3) {
            gap = gap * 3 + 1;
        }
        while (gap >= 1) {
            for (int i = gap; i < N; i++) {
                for (int j = i; j >= gap && Example.less(a[j], a[j - gap]); j -= gap)
                    Example.exch(a, j, j - gap);
            }
            gap = gap / 3;
        }
    }
    public static void main(String[] args) {
        Integer[] a = {58,77,30,26,981,868,998,666,254,318};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }

}

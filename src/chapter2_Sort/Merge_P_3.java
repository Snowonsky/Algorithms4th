package chapter2_Sort;

/**
 * @Description:又是merge的那里的条件写错，需要找出原因,错了很多次了
 * @Create: 2019-12-26-10:26
 */
public class Merge_P_3 {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a,0,a.length - 1);
    }

    public static void sort(Comparable[] a, int l, int r) {
        if(l >= r) return;
        int m = l + (r - l) / 2;
        sort(a,l,m);
        sort(a,m+1,r);
        merge(a,l,m,r);
    }

    public static void merge(Comparable[] a, int l, int m, int r) {
        int i = l;
        int j = m + 1;

        //这里的条件又出错了,你可以这样来想象，当到最后一步的时候，即两个元素相比较的时候，
        //假如是0和1，那么，如果只是小于，而没有=于，那只有一个元素可以进去，所以需要=号。
        for (int k = l; k <= r; k++) {
            aux[k] = a[k];
        }

        //条件又出错了,写成 k < r
        for (int k = l; k <= r; k++) {
            if (i > m) a[k] = aux[j++];
            else if (j > r) a[k] = aux[i++];
            else if (Example.less(aux[i],aux[j])) a[k] = aux[i++];
            else a[k] = a[j++];
        }
    }

    public static void main(String[] args) {
        Integer[] a = {58,77,30,26,981,868,998,666,254,318};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }

}

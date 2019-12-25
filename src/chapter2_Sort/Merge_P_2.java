package chapter2_Sort;

/**
 * @Description:不够熟练，错误百出
 * @Create: 2019-12-25-21:47
 */
public class Merge_P_2 {

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

        // diu你，这里又错了，明明错了两次了
        /*for (int k = l; k < r; k++) {
            aux[k] = a[k];
        }*/
        for (int k = l; k <= r; k++) {
            aux[k] = a[k];
        }
        //这里的条件也错了
        /*for (int k = l; k < r; k++) {
            if (i > j) a[k] = aux[j++];
            else if (j > r) a[k] = aux[i++];
            else if (Example.less(a[i], a[j])) a[k] = aux[i++];
            else a[k] = aux[j++];
        }*/
        for (int k = l; k <= r; k++) {
            if(i > m) a[k] = aux[j++];
            else if(j > r) a[k] = aux[i++];
            else if(Example.less(a[i],a[j])) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }
    public static void main(String[] args) {
        Integer[] a = {58,77,30,26,981,868,998,666,254,318};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}

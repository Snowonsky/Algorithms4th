package chapter2_Sort;

/**
 * @Description:
 * @Create: 2019-12-24-18:46
 */
public class Merge {
    //辅助操作的数组
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
    }

    //
    private static void sort(Comparable[] a, int lo, int hi) {
        if(lo >= hi) return;
        int mid = lo + (hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

    //合并的方法
    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (Example.less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
    public static void main(String[] args) {
        Character[] a = {'M','E','R','G','E','S','O','R','T','E','X','A','M','P','L','E'};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }

}

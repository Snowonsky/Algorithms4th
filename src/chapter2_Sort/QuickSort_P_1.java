package chapter2_Sort;


/**
 * @Description:
 * @Create: 2019-12-25-22:05
 */
public class QuickSort_P_1 {

    public static void quickSort(Comparable[] a) {
        int len;
        if(a == null || (len = a.length) == 0 || len == 1) return;
        sort(a,0,len-1);
    }

    public static void sort(Comparable[] a, int l, int r) {
        if(l >= r) return;
        int i = l;
        int j = r;
        Comparable base = a[l];
        while (i < j) {
            while (Example.less(base,a[j]) && i < j){
                j--;
            }
            while (Example.less(a[i],base) && i < j){
                i++;
            }
            if(i < j)
            Example.exch(a,i,j);
        }
        sort(a,l,i-1);
        sort(a,i+1,r);
    }
    public static void main(String[] args) {
        Integer[] a = {58, 77, 30, 26, 981, 868, 998, 666, 254, 318};
        quickSort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }


}

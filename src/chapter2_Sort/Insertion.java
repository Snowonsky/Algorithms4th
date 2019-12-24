package chapter2_Sort;

/**
 * @Description:插入排序,对于部分有序的数组十分高效。
 * @Create: 2019-12-24-14:59
 */
public class Insertion {

    public static void sort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && Example.less(a[j],a[j-1]); j--)
                Example.exch(a,j,j-1);
        }
    }

    public static void main(String[] args) {
        String[] a = {"bed","yes","zoo","abc","dad"};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}

package chapter2_Sort;

/**
 * @Description:插入排序的第一次练习，没有能自行完成。
 * @Create: 2019-12-25-13:53
 */
public class Insertion_P_1 {
    public static void sort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            //不断的从最后一个，一直冒泡？到前面适合的位置
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

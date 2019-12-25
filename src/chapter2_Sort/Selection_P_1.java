package chapter2_Sort;

/**
 * @Description:选择排序第一次练习写出
 * @Create: 2019-12-25-13:45
 */
public class Selection_P_1 {
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if(Example.less(a[j],a[min])) min = j;
            }
            Example.exch(a,min,i);
        }
    }
    public static void main(String[] args) {
        String[] a = {"zoo","bag","bed","yes","dad"};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}

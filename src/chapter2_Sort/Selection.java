package chapter2_Sort;

/**
 * @Description:选择排序
 * @Create: 2019-12-24-14:20
 */
public class Selection{

    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++)
                if(Example.less(a[j],a[i])) min = j;
            Example.exch(a,i,min);
        }
    }

    public static void main(String[] args) {
        String[] a = {"bed","bag","zoo","yes","dad"};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}

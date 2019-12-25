package chapter2_Sort;

/**
 * @Description:未完成。垃圾
 * @Create: 2019-12-25-21:11
 */
public class Selection_P_2 {
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if(Example.less(a[j],a[min])) min = j;
                Example.exch(a,min,i);
        }
    }
}

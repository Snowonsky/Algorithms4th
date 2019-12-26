package chapter2_Sort;

/**
 * @Description:唉，怎么还是条件这里会错啊！！！！，好烦啊。
 * @Create: 2019-12-26-10:13
 */
public class Selection_P_3 {
    public static void sort(Comparable[] a) {
        //这个条件是从0 到 倒数第一个元素，因为下面要 + 1，防止越界。
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            //这个的条件是，+ 了 1 ，但是它比较的东西是从头到尾的，所以不能减。
            for (int j = i + 1; j < a.length; j++)
                if(Example.less(a[j],a[min])) min = j;
                Example.exch(a,i,min);
        }
    }
    public static void main(String[] args) {
        Integer[] a = {58,77,30,26,981,868,998,666,254,318};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}

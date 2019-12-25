package chapter2_Sort;

/**
 * @Description:还是有些不够熟悉，不能快速的写出来
 * @Create: 2019-12-25-21:22
 */
public class Shell_P_2 {
    public static void sort(Comparable[] a) {

        int N = a.length;
        int gap2 = 1;
        while (gap2 < N/3) gap2 = gap2 * 3 + 1;
        while (gap2 >= 1){
            //这里的i的范围，其实是除去第0个元素，后面的全都要，所以不要减1，猫族
            for (int i = gap2; i < N; i++) {
                for (int j = i; j >= gap2 && Example.less(a[j],a[j-gap2]); j-=gap2) {
                    Example.exch(a,j,j-1);
                }
            }
            gap2 = gap2/3;
        }
    }
    public static void main(String[] args) {
        Integer[] a = {58,77,30,26,981,868,998,666,254,318};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }

}

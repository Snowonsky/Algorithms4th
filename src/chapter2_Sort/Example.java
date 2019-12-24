package chapter2_Sort;

/**
 * @Description:排序算法类的模板
 * @Create: 2019-12-24-14:24
 */
public class Example {

    //判断大小，如果 v<w 则返回true
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }
    //交换两个数
    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    //打印数组
    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            System.out.println();
        }
    }
    //测试是否有序
    public static boolean isSorted(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            if(less(a[i],a[i-1])) return false;
        }
        return true;
    }


}

package chapter2_Sort;

/**
 * @Description:归并排序的自写练习,未完成
 * @Summary:
 * (1)先写出merge，合并的方法，关键是，创建一个辅助数组aux，将a需要的赋值到aux中，然后
 * 循环，循环条件要知道是传入的位置，然后分别有4中情况，左无，右无，左大，右大对应即可
 * (2)然后写出递归的sort，参数要知道，左和右，中间参数自己算(是减法，别算错)，然后分别两
 * 个递归，最后加上合并
 * (3)记得要为aux数组创建。
 * @Create: 2019-12-25-14:06
 */
public class Merge_P_1 {
    private static Comparable[] aux;

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
    }

    //参数列表不熟悉
    public static void sort(Comparable[] a, int l, int r) {
        if (l >= r) return;
        // 这里我写成了 （l + r）/2
        int m = l + (r - l)/2;
        sort(a,l,m);
        sort(a,m+1,r);
        merge(a,l,m,r);
    }


    public static void merge(Comparable[] a, int l, int m, int r) {
        int i = l;
        int j = m + 1;
        //条件不够熟悉，大体的逻辑算是对的，但是还是挺多错误
        /*for (int k = 0; k < a.length; k++) {
            if(i > m) aux[k] = a[i++];
            else if(j > r) aux[k] = a[j++];
            else if(Example.less(a[j],a[i])) aux[k] = a[j++];
            else aux[k] = a[i++];
        }*/
        //因为你所要操作的数并不一定是从0开始，所以需要先给辅助数组赋值
        //这里是  k <= r，我搞错了，写成   k < r
        for (int k = l; k <= r; k++) {
            aux[k] = a[k];
        }
        for (int k = l; k <= r; k++) {
            if (i > m) a[k] = aux[j++];
            else if (j > r) a[k] = aux[i++];
            else if (Example.less(aux[j], aux[i])) a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
    public static void main(String[] args) {
        Integer[] a = {58,77,30,26,981,868,998,666,254,318};
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}

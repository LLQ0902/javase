package day01_10.day06;

/*
	4.定义一个方法
		public static ? fill(int[] arr,int fromIndex,int toIndex,int value)
		功能:将数组arr中的元素从索引fromIndex开始到toIndex(不包含toIndex)对应的值改为value
		比如：fill(arr,1,4,23)把 arr[1] 到 arr[3] 的元素都改成23
 */
public class Work04 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9} ;
        fill(arr,1,4,23);
    }
    public static void fill(int[] arr, int fromIndex, int toIndex, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (i >= fromIndex && i < toIndex){
                arr[i] = value;
            }
            System.out.print(arr[i]+" ");
        }
    }
}

public class bth5 {
    public static void main(String[] args) {
        int[]array={1,3,4,5,6,7};
        int index=minvalue(array);
        System.out.println("gia tri nhỏ nhất của mang là" + " " +array[index]);
    }

    public static int minvalue(int[]array){
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<array[index]){
                index=i;
            }
        }return index;

    }
}

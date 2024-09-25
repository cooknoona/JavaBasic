package JavaBasic;
/*  */
public class Cloning {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = arr1;

        arr1[0] = 1;
        arr1[1] = 1;
        arr1[2] = 1;

        arr2[0] = 1000;
        arr2[1] = 2000;
        arr2[2] = 3000;

        for (int e : arr1)
            System.out.print(e + " ");
    }
}

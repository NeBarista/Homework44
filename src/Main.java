public class Main {
    public static void main(String[] args) {
        int[] newArray = doubleArray(new int[] {8, 7, 6, 5});
        String text = "";
        for (int number:newArray) {
            text += number + " ";
        }
        System.out.println(text);

    }
    public static int[] doubleArray(int [] array) {
        int [] res = new int [array.length * 2];
        int f = 0;
        for (int a = 0; a < res.length; a+=2) {
            res[a] = array[f];
            res[a +1] = array[f];
            f++;
        }
        return res;
    }
}
public class Lab52 {
    public static void main(String[] args) {
        int array1[] = new int[20];
        for (int i = 0; i < 20; i++) {
            array1[i] = (int) (Math.random() * 9);
            System.out.print(array1[i] + " ");
        }System.out.println("///");

        for (int j = 0; j < 20; j++) {
            if (j % 2 == 1) {
                array1[j] = 0;
            }else;{
            }System.out.print(array1[j] + " ");
        }

    }
}
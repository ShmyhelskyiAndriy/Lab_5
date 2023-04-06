public class Lab55 {
    public static void main(String[] args) {
        int array1[] = new int[15];
        int num=0;
        for (int i = 0; i < 15; i++) {
            array1[i] = (int) (Math.random() * 10);
            System.out.print(array1[i] + " ");
        }
        System.out.println("///");
        for (int i = 0; i < 15; i++) {
            if (array1[i] % 2 == 0){
                num++;
            }
        }System.out.println(num + " парних елементів в масиві");
    }
}

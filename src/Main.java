public class Main {
    public static void main(String[] args) {
        System.out.println(" Первый массив");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int a= arr1.length-1;a>=0;a--){
            System.out.print(arr1[a]);

        }
        System.out.println(" \n");
        System.out.println("Первый массив , который стал четным :");
        for (int j=0;j< arr1.length;j++){
            if (arr1[j]%2!=0){
                arr1[j]=arr1[j]+1;
            }
            System.out.println(arr1[j]+" ");
            }

        System.out.println(" \n");
        System.out.println("Второй массив");

        double[] arr2 = {1.57, 7.654, 9.986};
        for (int b = arr2.length-1; b >=0;b--){
            System.out.print(arr2[b]+" ");
        }
        System.out.println(" \n");
        System.out.println("Третий массив");

int []arr3= {45,9,764,532,0,8};
for (int i=arr3.length-1;i>=0;i--) {
    System.out.print(arr3[i] + " ");
}
}


    }

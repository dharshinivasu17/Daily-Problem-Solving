import java.util.*;

class index_subarr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++) {
            int sum = 0;

            for(int j = i; j < n; j++) {
                sum += arr[j];

                if(sum == target) {
                    System.out.println((i+1) + " " + (j+1));
                    found = true;
                    break;
                }

                if(sum > target) {
                    break;
                }
            }

            if(found) break;
        }

        if(!found) {
            System.out.println("-1");
        }

        sc.close();
    }
}
import java.util.Scanner;


public class ArrayAddition {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of first array ");
			int first = sc.nextInt();
			int arr1[] = new int[first];
			System.out.println("Enter the elements for first array");
			for(int i=0;i<arr1.length;i++) {
				arr1[i]=sc.nextInt();
			}
			System.out.println("Enter the size of second array");
			int second = sc.nextInt();
			int arr2[] = new int[second];
			System.out.println("Enter the elements for second array");
			for(int i=0;i<second;i++) {
				arr2[i] = sc.nextInt();
			}
			int result = first>second ? first:second;
			int iSumArray[] = new int[result];
			for(int i=0;i<result;i++) {
				if(i<first && i<second) {
					iSumArray[i]=arr1[i]+arr2[i];
				}else if(i>=first) {
					iSumArray[i]=arr2[i];
				}else if(i>=second) {
					iSumArray[i]=arr1[i];
				}
					
					
			}
			for(int i=0;i<result;i++)
				System.out.println(iSumArray[i]);
		}
	

}

package fundamentals;


public class HelloWorld {
	public static String reverse(String str) {
		String ans = "";
		for(int i = 0; i < str.length(); i++) {
			ans = str.charAt(i) + ans;
		}
		return ans;
	}
	
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public static int sum(int[] arr) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	     
	}
	
	public static int largestInArr(int[] arr) {
		int largest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
//		System.out.println(reverse("hello"));
		int[] arr = {1, 2, 3,4,5};
		System.out.println(largestInArr(arr));
//		printArr(arr);
//		System.out.println(sum(arr));
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter first number: ");
//		int a = sc.nextInt();
//		System.out.print("Enter second number: ");
//        int b = sc.nextInt();
//        
//        int ans = a + b;
//        System.out.println(ans);
//
	}

}

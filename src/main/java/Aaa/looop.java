package Aaa;

public class looop {

	public static void main(String[] args) {
		
		for(int i=10; i>1; i--){
            System.out.print("The value of i is: "+i);
       }
		int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0 too
        for(int i=0; i<arr.length; i++){
             System.out.print(arr[i]);
        }
        int arr1[]={2,11,45,9};
        
        for (int num : arr1) {
           System.out.println(num);     
        }
        String arr2[]={"hi","hello","bye"};
        for (String str : arr2) {
                 System.out.println(str);
        }
	}

}

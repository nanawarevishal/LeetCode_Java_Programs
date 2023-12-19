package Strings.Medium;

class KLargestElement{

    static String kthLargestNumber(String[] nums, int k) {
        
        long num[] = new long[nums.length];
        for(int i=0;i<nums.length;i++){
            num[i] = Integer.parseInt(nums[i]); 
        }

        mergeSort(num,0,num.length-1);
        // for(int i=0;i<num.length;i++){
        //     System.out.println(num[i]);
        // }


        return num[k-1]+"";
    }

    static void merge(long arr[],int start,int mid,int end){
        int n1 = mid - start + 1;
		int n2 = end - mid;

		long nums1[] = new long[n1];
		long nums2[] = new long[n2];
		for(int i = 0; i < n1; i++) {
			
			nums1[i] = arr[start + i];
		}

		for(int i = 0; i < n2; i++) {
			
			nums2[i] = arr[mid + i + 1];
		}

		int i = 0, j = 0, k = start;

		while(i < nums1.length && j < nums2.length) {
			
			if(nums1[i] > nums2[j]) {
				
				arr[k] = nums1[i];
				i++;
			} else {
					
				arr[k] = nums2[j];
				j++;
			}
			k++;
		}

		while(i < nums1.length) {
			
			arr[k] = nums1[i];
			i++;
			k++;
		}

		while(j < nums2.length) {
		
			arr[k] = nums2[j];
			j++;
			k++;
		}
    }

    static void mergeSort(long[] arr,int start,int end){

        if(start < end){

            int mid = start + (end-start)/2;

            mergeSort(arr, start,mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        String nums[] = {"2","21","12","1"}; 
        int k = 3;

        System.out.println(kthLargestNumber(nums, k));

    }
}
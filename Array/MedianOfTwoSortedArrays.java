public class MedianOfTwoSortedArrays{
    public static void main(String ar[]){

        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int n = nums1.length + nums2.length;
        int i = 0, j = 0, cnt = 0;
        int ind2 = n / 2;
        int ind1 = ind2 - 1;
        int ind1el = -1, ind2el = -1;

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                if(cnt == ind1) ind1el = nums1[i];
                if(cnt == ind2) ind2el = nums1[i];
                cnt++;
                i++;
            }else{
                if(cnt == ind1) ind1el = nums2[j];
                if(cnt == ind2) ind2el = nums2[j];
                cnt++;
                j++;
            }
        }

        while(i < nums1.length){
            if(cnt == ind1) ind1el = nums1[i];
            if(cnt == ind2) ind2el = nums1[i];
            cnt++;
            i++;
        }

        while(j < nums2.length){
            if(cnt == ind1) ind1el = nums2[j];
            if(cnt == ind2) ind2el = nums2[j];
            cnt++;
            j++;
        }

        if(n % 2 == 1){
            return ind2el;
        }

        return (double)((double)(ind1el + ind2el)) / 2.0;



        
        // int[] resultNum = new int[n];

        // int i = 0,j = 0, k = 0;
        // while(i < nums1.length && j < nums2.length){

        //     if(nums1[i] < nums2[j]){
        //         resultNum[k++] = nums1[i++];
        //     }else{
        //         resultNum[k++] = nums2[j++];
        //     }
        // }

        // while(i < nums1.length) resultNum[k++] = nums1[i++];

        // while(j < nums2.length) resultNum[k++] = nums2[j++];

        // if(n % 2 == 1){
        //     return resultNum[n/2];
        // }

        // return (double)((double)(resultNum[n/2] + (double)(resultNum[n/2 - 1])) / 2.0);
    }
}
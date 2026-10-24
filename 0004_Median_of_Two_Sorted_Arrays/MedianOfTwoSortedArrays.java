class Solution_4
{   
    private double Binary(int small[], int big[]) {
    int low = 0;
    int high = small.length;

    while (low <= high) {
        int i = low + (high - low) / 2;      
        int j = (small.length + big.length)/2 - i; 

        int smallLeftMax  = (i == 0) ? Integer.MIN_VALUE : small[i-1];
        int smallRightMin = (i == small.length) ? Integer.MAX_VALUE : small[i];
        int bigLeftMax    = (j == 0) ? Integer.MIN_VALUE : big[j-1];
        int bigRightMin   = (j == big.length) ? Integer.MAX_VALUE : big[j];

        if (smallLeftMax > bigRightMin) {
            high = i - 1;
        } else if (bigLeftMax > smallRightMin) {
            low = i + 1;
        } else {
            if ((small.length + big.length) % 2 == 0) {
                return (Math.max(smallLeftMax, bigLeftMax) + 
                        Math.min(smallRightMin, bigRightMin)) / 2.0;
            } else {
                return Math.min(smallRightMin, bigRightMin);
            }
        }
    }
    return 0;
}

    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        double result=0;
        if(nums1.length>nums2.length)
            {
                result=this.Binary(nums2, nums1);
            }
        else
            {
                result=this.Binary(nums1, nums2);
            }
        return result;
    }
}

;
        int nums2[]={2};
        System.out.println(sol.findMedianSortedArrays(nums1, nums2));

    }    
}

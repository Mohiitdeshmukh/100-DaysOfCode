class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int [] res = new int[n+m];
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]) res[k++] = nums1[i++];
            else res[k++] = nums2[j++];
        }
        while(i<m) res[k++] = nums1[i++];
        while(j<n) res[k++] = nums2[j++];
        int ln = res.length;
        return ln%2==0 ? (double)(res[ln/2]+res[ln/2-1])/2 : res[ln/2];
    }
}

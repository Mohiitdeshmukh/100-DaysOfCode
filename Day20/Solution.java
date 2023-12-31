class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        p(nums, 0, ans);
        return ans;
    }

    public static void p(int[] nums, int p, List<List<Integer>> ans) {
        if (p < nums.length) {
            p(nums, p+1, ans);
        }
        for (int i = p+1; i < nums.length; i++) {
            // swap i and p and contue
            int t = nums[i];
            nums[i] = nums[p];
            nums[p] = t;

            ans.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            p(nums, p+1, ans);

            t = nums[i];
            nums[i] = nums[p];
            nums[p] = t;
        }
    }

}

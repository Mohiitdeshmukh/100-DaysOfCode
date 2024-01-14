class Solution {
    public List<Integer> partitionLabels(String s) {

        List<Integer> list = new ArrayList<>();
        int[] arr = new int[26];

        for(int i = 0;i<s.length();i++) {
           arr[s.charAt(i)-'a'] = i;
        }

        int i = 0, j = 0, prev = 0;
        
        while(i<s.length() && j < s.length()) {

        int maxLastIndex = arr[s.charAt(i)-'a'];

        while(j <= maxLastIndex) {
            maxLastIndex = Math.max(maxLastIndex, arr[s.charAt(j)-'a']);
            j++;
        }

        prev = i;
        i = maxLastIndex + 1;

        if(list.size() == 0) list.add(i);
        else list.add(i-prev);
          
        }
        return list;
    }
}

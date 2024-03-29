class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for(String str : strs){
             char[] cArray=str.toCharArray();
             Arrays.sort(cArray);
             String s=new String(cArray);

             if(!map.containsKey(s)){
                 map.put(s, new ArrayList<>());
             }
             map.get(s).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

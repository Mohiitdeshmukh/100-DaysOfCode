class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return canWordBreak(s, new HashSet<>(wordDict), new HashMap<>());
    }

    boolean canWordBreak(String prefix, Set<String> dict, Map<String, Boolean> dp) {
        if(prefix.isEmpty())
            return true;
        if(!dp.containsKey(prefix)) {
            boolean canWordBreak = false;
            for(String word : dict) {
                if(prefix.startsWith(word)) {
                    if(prefix.length() == word.length()) {
                        canWordBreak = true;
                        break;
                    } else {
                        canWordBreak = canWordBreak(prefix.substring(word.length()), dict, dp);
                        if(canWordBreak) {
                            break;
                        }
                    }
                }
            }
            dp.put(prefix, canWordBreak);
        }
        return dp.get(prefix);
    }
}

class Solution {
public int numIdenticalPairs(int[] A) {
    int result = 0, cnt[] = new int[101];
    for(int a : A) result += cnt[a]++;
    return result;
}
}

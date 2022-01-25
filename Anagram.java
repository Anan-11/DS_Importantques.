//Aproach 1
class Solution {
    public boolean isAnagram(String s, String t) {
        boolean res=false;
        if(s.length()!=t.length())
            return false;
        else
        {
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if((Arrays.toString(c1)).equals((Arrays.toString(c2))))
            res=true;
    
        }
        return res;
    }
}

//Approach 2(Better)
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sCounts = new int[26], tCounts = new int[26];
        count(s, sCounts);
        count(t, tCounts);
        for(int i = 0; i < sCounts.length; i++) {
            if(sCounts[i] != tCounts[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    void count(String s, int[] counts) {
        for(char c : s.toCharArray()) {
            counts[c-'a']++;
        }
    }
}

class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen  = set()
        i = 0
        result = 0
        for j in range(len(s)):
            while s[j] in seen:
                seen.remove(s[i])
                i+=1
            seen.add(s[j])
            result = max(result,j-i+1)
        return result   

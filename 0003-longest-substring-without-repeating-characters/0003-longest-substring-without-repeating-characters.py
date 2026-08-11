class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left = 0
        result = 0
        freq = {}
        for right in range(len(s)):
            freq[s[right]] = freq.get(s[right],0) + 1
            while freq[s[right]] > 1:
                freq[s[left]] -= 1
                if freq[s[left]] == 0:
                    del freq[s[left]]
                left += 1

            result = max(result,right-left+1)
        return result
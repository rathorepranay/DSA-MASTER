class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        n = len(fruits)
        left = 0
        result = -1
        freq = {}
        for right in range(n):
            freq[fruits[right]] = freq.get(fruits[right],0) + 1
            if len(freq) > 2:
                freq[fruits[left]] -= 1
                if freq[fruits[left]] == 0:
                    del freq[fruits[left]]
                left += 1
            
            result = max(result, right-left + 1)
        return result 

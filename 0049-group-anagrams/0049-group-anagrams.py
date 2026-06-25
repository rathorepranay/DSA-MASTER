class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d= {}
        for st in strs:
            st_sort = "".join(sorted(st))
            if st_sort in d:
                d[st_sort].append(st)
            else:
                d[st_sort] = [st]
        return list(d.values())
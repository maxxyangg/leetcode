class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start = 0;
        end = 0;
        _max = 0;
        _set = set()
        while(end < len(s)):
            if(s[end] not in _set):
                _set.add(s[end])
                end += 1
                _max = max(_max, len(_set))
            else:
                _set.remove(s[start])
                start += 1
        
        return _max
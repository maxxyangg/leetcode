class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        int maxCount = 0;
        String tempStr = new String();
        for(int i = 0; i < s.length(); i++){
            count = 0;
            for(int j = i; j < s.length(); j++){
                if(!tempStr.contains(s.substring( j, j+1))){
                    count++;
                    tempStr += s.substring(j, j+1);
                    if(maxCount < count){
                        maxCount = count;
                    }
                
                }else{
                    tempStr = new String();
                    break;
                }
            }
        }
        return maxCount;
    }

}
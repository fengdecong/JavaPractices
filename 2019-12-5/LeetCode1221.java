class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        List<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(list.isEmpty()){
                list.add(c);
            }else if(c == list.get(list.size()-1)){
                list.add(c);
            }else{
                list.remove(list.size()-1);
                if(list.isEmpty()){
                    count++;
                }
            }
        }
        return count;
    }
}
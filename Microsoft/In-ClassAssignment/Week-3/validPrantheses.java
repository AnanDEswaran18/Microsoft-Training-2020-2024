class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> mapping = new HashMap<Character,Character>();
        mapping.put(')','(');
        mapping.put('}','{');
        mapping.put(']','[');
        
        Stack<Character> stk = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(mapping.containsKey(c)){
                char topElement = stk.empty()?' ':stk.pop();
                if(topElement!=mapping.get(c)){
                    return false;
                }
            }else{
                stk.push(c);
            }
        }
        return stk.empty();
    }
}

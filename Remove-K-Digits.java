class Solution {
    public String removeKdigits(String str, int k) {
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek() > ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
            while(k>0 && !stack.isEmpty()){
                stack.pop();
                k--;
            }
            StringBuilder res = new StringBuilder();
            for(char c : stack){
                res.append(c);
            }

            while(res.length() > 0 && res.charAt(0) =='0'){
                res.deleteCharAt(0);
            }
        
        if(res.length() == 0){
            return \0\;
        }
        
        return res.toString();
    }
}

class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.add(i);
            }
            else if(ch == ')'){
                if(!stack.isEmpty()){
                stack.pop();
                }
                else{
                    set.add(i);
                }
            }
        }

        while(!stack.isEmpty()){
            set.add(stack.pop());
        }
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length();i++){
            if(!set.contains(i)){
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
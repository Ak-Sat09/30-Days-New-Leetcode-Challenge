class Solution {
    public static List<String> backtrack(List<String> res , String curr , int open , int close , int n){
        if(curr.length() == 2*n){
            res.add(curr);
            return res;
        }
        if(open < n){
            backtrack(res,curr+\(\,open+1,close,n);
        }
        if(close < open){
            backtrack(res,curr+\)\,open,close+1,n);
        }
        return res;
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result,\\,0,0,n);
        return result;
    }
}
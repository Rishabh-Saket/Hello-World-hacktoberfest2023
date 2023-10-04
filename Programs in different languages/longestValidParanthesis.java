class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> index=new Stack<>();
        index.push(-1);
        int len=0,x;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(') index.push(i);
            else
            {
                index.pop();
                if(index.isEmpty()) index.push(i);
                else
                {
                    x=index.peek();                    
                    len=Math.max(i-x,len);
                }
            }
        }
        return len;
    }
}

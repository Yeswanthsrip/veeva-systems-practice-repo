class Solution {
    public static String infixToPostfix(String s) {
        int n=s.length();
        StringBuffer sb=new StringBuffer();
        char c[]=s.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=c[i];
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
                sb.append(String.valueOf(ch));
            }
            else if(ch=='('){
                st.push('(');
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
            }
            else if(ch=='^'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    st.push(ch);
                }
                else{
                    if(ch=='+' || ch=='-'){
                        while(!st.isEmpty() && (st.peek()=='*' || st.peek()=='/' || st.peek()=='^'
                        || st.peek()=='+' || st.peek()=='-')){
                            sb.append(st.pop());
                        }
                        st.push(ch);
                    }
                    else{
                        while(!st.isEmpty() && (st.peek()=='^' || st.peek()=='/' || st.peek()=='*')){
                            sb.append(st.pop());
                        }
                        st.push(ch);
                    }
                }
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}
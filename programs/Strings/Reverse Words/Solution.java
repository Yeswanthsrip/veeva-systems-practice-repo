class Solution {
    public String reverseWords(String s) {
        String st[]=s.split("\\.");
        // for(String x:st){
        //     System.out.print(x+" ");
        // }
        // System.out.println();
        StringBuffer sb=new StringBuffer();
        for(int i=st.length-1;i>=0;i--){
            if(st[i].length()>0){
                sb.append(st[i]);
                sb.append(".");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}

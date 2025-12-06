class RemoveOuterParanthesis {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            int flag = 0;
            char ch = s.charAt(i);
            if(ch == '('){
                if(count >= 1){
                    answer.append(ch);
                }
                count++;
            }else if (ch == ')'){
                count--;
                if(count >= 1){
                    answer.append(ch);
                }
            }
        }
        return answer.toString();
    }
}
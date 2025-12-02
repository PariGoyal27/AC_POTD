class Solution {
    public static int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        for(String s: operations){
            switch(s){
                case "C":
                    list.remove(list.size()-1);
                    break;
                case "D":
                    int last = list.get(list.size()-1);
                    list.add(last*2);
                    break;
                case "+":
                    int last1 = list.get(list.size()-1);
                    int last2 = list.get(list.size()-2);
                    list.add(last1 + last2);
                    break;
                default:
                    list.add(Integer.parseInt(s));
                    break;
            }
        }
        int sum = 0;
        for(int e: list){
            sum += e;
        }
        return sum;
    }
}
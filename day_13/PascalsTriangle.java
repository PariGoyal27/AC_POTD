package day_13;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            list.add(new ArrayList<>());
        }
        list.get(0).add(1);
        for(int i = 1; i < numRows; i++){
            list.get(i).add(1);
            int c = 0;
            for(int j = 0; j < i-1; j++){
                int sum = list.get(i-1).get(c++) + list.get(i-1).get(c);
                list.get(i).add(sum);
            }
            list.get(i).add(1);
        }
        return list;
    }
}

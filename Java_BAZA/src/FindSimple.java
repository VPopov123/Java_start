
import java.util.ArrayList;

public class FindSimple {
    public ArrayList<Integer> findSimple(int start, int end) {
        ArrayList<Integer> simpleNum = new ArrayList<Integer>();

        if (start > 3 && end > start) {
            searchSimpleNum(start, end, simpleNum);

        } else if (start > 0 && start <= 3 && end > start){
            int i = start;
            do {
                simpleNum.add(i);
                i++;
            } while (i <= 3 && i <= end);
            if(i < end) searchSimpleNum(i, end, simpleNum);
        }
        else simpleNum = null;



        return simpleNum;
    }

    private void searchSimpleNum(int start, int end, ArrayList<Integer> results) {
        for (int i = start; i <= end; i++) {

            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) results.add(i);
        }

    }
}

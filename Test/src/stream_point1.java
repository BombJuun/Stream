import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream_point1 {
    public static void main(String[] args) throws Exception {
        List<Integer> list=Arrays.asList(3,1,5,4,2);
        //정렬 후 다시 리스트로 변환
        List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());
        


        System.out.println(list);   //원본 그대로
        System.out.println(sortedList);//정렬된 리스트
        
    }
}

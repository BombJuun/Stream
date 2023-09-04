import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream_point1 {
    public static void main(String[] args) throws Exception {
        List<Integer> list=Arrays.asList(3,1,5,4,2);
        List<Integer> sortedList=list.stream().sorted().collect(Collectors.toList());

        System.out.println(list);
        System.out.println(sortedList);
        System.out.println();
    }
}

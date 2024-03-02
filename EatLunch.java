import java.util.ArrayList;
import java.util.List;

public class EatLunch {
    public static int countStudents(int[] students, int[] sandwiches){
        int i = 0;
        int j = 0;
        List<Integer> temp = new ArrayList<>();
        List<Integer> myList = new ArrayList<>();
        for (int num : students){
            temp.add(num);
        }

        while (i < temp.size()){
            if (temp.get(i) == sandwiches[j]){
                j++;
                temp.remove(i);
            }else {

                if (myList.size() == temp.size()){
                    int p = 0;
                    for (p=0; p<temp.size(); p++){
                        if (temp.get(p) != myList.get(p)){
                            break;
                        }
                    }
                    if (p == temp.size()){
                        break;
                    }
                }

                myList = new ArrayList<>();
                for (int num : temp){
                    myList.add(num);
                }

                int removedNumber = temp.remove(i);
                temp.add(removedNumber);
            }
        }

        return sandwiches.length-j;
    }
    public static void main(String[] args) {
        int[] students = {1,1,0,0};
        int[] sandwiches = {0,1,0,1};

        System.out.println(countStudents(students,sandwiches));
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Kiên",30,"HT");
        Student student1 = new Student("Mai", 26,"HN");
        Student student2 = new Student("Nam",38,"HT");
        Student student3 = new Student("Hải", 31,"HT");
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        System.out.println("Theo bảng chữ cái:");
        for (Student st : list){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student st : list){
            System.out.println(st.toString());
        }
    }
}

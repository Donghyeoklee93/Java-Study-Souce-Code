import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class StudentInfo implements Comparable {
    String name;
    int group;
    int no;
    int kor, eng, math;

    StudentInfo(String name, int group, int no, int kor, int eng, int math) {
        this.name = name;
        this.group = group;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name + "," + group + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
    }

    public int compareTo(Object o){
        if(o instanceof StudentInfo) {
            StudentInfo tmp = (StudentInfo) o;

            return name.compareTo(tmp.name);
        } else{
            return -1;
        }
    }
}

public class StudentList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new StudentInfo("hong", 1, 1, 100, 100, 100));
        list.add(new StudentInfo("lee", 1, 2, 90, 70, 80));
        list.add(new StudentInfo("kim", 1, 3, 80, 80, 90));
        list.add(new StudentInfo("lee", 1, 4, 70, 90, 70));
        list.add(new StudentInfo("anh", 1, 5, 60, 100, 80));

        Collections.sort(list);
        Iterator it = list.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}

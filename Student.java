public class Student {
    public static void main(String [] agrs){
        StudentDetail student1 = new StudentDetail();
        student1.name = "Henry";
        student1.section = 1;
        student1.no = 1;
        student1.english = 100;
        student1.vietnames = 60;
        student1.spanish = 76;

        System.out.println("Name :" + student1.name);
        System.out.println("Total :" + student1.getTotal());
        System.out.println("Average :" + student1.getAverage());


        StudentDetail student2 = new StudentDetail("Bella",1,1,100,60,76);
        System.out.println(student2.info());
    }
}

class StudentDetail {
    String name;
    int section;
    int no;
    int english;
    int vietnames;
    int spanish;


    public StudentDetail(){
    }

    public StudentDetail(String name, int section, int no, int english, int vietnames, int spanish){
        this.name = name;
        this.section = section;
        this.no = no;
        this.english = english;
        this.vietnames = vietnames;
        this.spanish = spanish;
    }

    int getTotal(){
        return english + vietnames + spanish;
    }

    float getAverage(){
        // return (getTotal() / 3);
        // return (getTotal() / 3f);
        // return (getTotal() / 3f * 10);
        // return (getTotal() / 3f * 10 + 0.5f);
        // return (int)(getTotal() / 3f * 10 + 0.5f) / 10;
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }

    String info(){
        return name + "," + section + "," + no + "," + english + "," + vietnames + "," + spanish + "," + getTotal() + "," + getAverage();
    }

}

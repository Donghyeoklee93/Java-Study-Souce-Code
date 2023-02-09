public class ChoiceActing {

    public static void action(Robot r) {
        if (r instanceof DanceRobot) {
            DanceRobot dr = (DanceRobot) r;
            dr.dance();
        } else if (r instanceof SingRobot) {
            SingRobot dr = (SingRobot) r;
            dr.sing();
        }
        else if (r instanceof DrawRobot) {
            DrawRobot dr = (DrawRobot) r;
            dr.draw();
        }
    }

    public static void main(String[] agrs) {
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

        for (int i = 0; i < arr.length; i++)
            action(arr[i]);
    }
}

class Robot {
}

class DanceRobot extends Robot {
    void dance() {
        System.out.println("Let's dance.");
    }
}

class SingRobot extends Robot {
    void sing() {
        System.out.println("Let's sing.");
    }
}

class DrawRobot extends Robot {
    void draw() {
        System.out.println("Let's draw.");
    }
}
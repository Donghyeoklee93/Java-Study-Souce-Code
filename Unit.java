// By using inheritance class, we can make the code more simple.
// Because each unit has diffrent move method, i made abstract method.

abstract class Unit {
    int x, y;
    abstract void move(int x, int y); // abstract class
    void stop(){}
}

class Marine extends Unit{
    // int x, y;
    // void stop(){}
    void move(int x, int y){}
    void stimPack(){}
}

class Tank extends Unit{
    // int x, y;
    // void stop(){}
    void move(int x, int y){}
    void changeMode(){}
}

class Dropship extends Unit{
    // int x, y;
    // void stop(){}
    void move(int x, int y){}
    void load(){}
    void unload(){}
}
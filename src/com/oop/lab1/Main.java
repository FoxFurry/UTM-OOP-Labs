package com.oop.lab1;

public class Main {
    public static boolean compareDisplays(Monitor _dis1, Monitor _dis2){
        return _dis1.color.length() > _dis2.color.length() || (_dis1.res.x > _dis2.res.x && _dis1.res.y > _dis2.res.y); // I dont know hot to compare monitors so here, a little workaround
    }

    public static void main(String[] args) {
        // Part 1
        Monitor SamsungSuperPuper = new Monitor(1920, 1080, 16, 9);
        Monitor NECMegaHyper = new Monitor(2560, 1600, 16, 9);
        SamsungSuperPuper.setColor("BlackMarble");
        NECMegaHyper.setColor("WhiteLikeToothPaste");
        if(compareDisplays(SamsungSuperPuper, NECMegaHyper)){
            System.out.println("Samsung is cooler!");
        }
        else System.out.println("NEC is cooler!");
        // Part 1 end

        // Part 2/3
        University  UTM = new University("UTM", 1967),
                    ULIM = new University("ULIM", -1),
                    ASEM = new University("Devochki_s_Asema", 13);

        ASEM.addStudent(new Student("Vlada", 7, 6.55f));
        ASEM.addStudent(new Student("Marina", 5, 5.45f));
        ASEM.addStudent(new Student("Ira", 8, 7.09f));
        System.out.println(ASEM.average());

        ULIM.addStudent(new Student("Anya", 5, 4.44f));
        ULIM.addStudent(new Student("Vika", 16, 5.67f));
        ULIM.addStudent(new Student("Nastya", 5,6.0005f));
        System.out.println(ULIM.average());

        UTM.addStudent(new Student("Jeka", 13, 1300.f));
        UTM.addStudent(new Student("Alex", 18, 999.f));
        UTM.addStudent(new Student("Arturchik", 18, 998.f));
        System.out.println(UTM.average());
        // Part 2/3 end
    }
}
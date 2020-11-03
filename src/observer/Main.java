package observer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Teacher t=new Teacher("GORG");
        Secretary s=new Secretary();
        Headoffice h=new Headoffice();

        Observable heating=new Observable(20);
        heating.addObserver(t);
        heating.addObserver(s);
        heating.addObserver(h);

        boolean running=true;
        while(running) {
            Scanner scanner = new Scanner(System.in);
            String st = scanner.nextLine();
            if (st.equals("stop")) {
                running = false;
            } else {
                try {
                    int input = Integer.parseInt(st);
                    System.out.println("Set heating to " + input);
                    heating.setValue(input);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Heating shut down");
    }
}
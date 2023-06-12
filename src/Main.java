import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quiz GUI = new Quiz();
        GUI.update("Welcome to Physics Quiz");
        GUI.update("Would you like to add a question? (Y/N)");
        System.out.println("Welcome to Physics Quiz");
        System.out.println("Would you like to add a question? (Y/N)");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        boolean future = false;
        String quest = "";
        String answers = "";
        String correct = "";
        if (answer.equals("Y")) {
            future = true;
            System.out.println("What Question?");
            quest = "Question 11:" + scan.nextLine() + "?";
            System.out.println("What Answer choices?");
            answers = scan.nextLine();
            System.out.println("What is the Answer?");
            correct = scan.nextLine();
        }
        questions q11 = new questions(quest, answers, correct);
        questions q1 = new questions("Question 1: When 2 waves with a 0 degrees difference pass through each other, what interference do they cause??", "(A)Constructive Interference, (B) Destructive Interference ", "A");
        questions q2 = new questions("Question 2: What type of wave is sound?", "(A) Transversal, (B) Sound, (C), Longitudinal, (D) Latitudinal ", "A");
        questions q3 = new questions("Question 3: What is the formula to find the gravitational force one object exerts on another?", "(A)(E=mc^2), (B)K(q1q2/d^2), (C) (Gq1q2)/(r)^2, (D) (1/2)m*v^2", "C");
        questions q4 = new questions("Question 4: What is the KE of a closed system if PE is 120 Joules? ", "(A)120 Joules, (B) 100 Joules, (C) 100 Newtons, (D) 120 Newtons", "A");
        questions q5 = new questions("Question 5: What causes loss of energy while creating heat in a system?", "(A) Solar Energy, (B) Sound, (C) Heat, (D) Friction", "D");
        questions q6 = new questions("Question 6: What are positively charged objects attracted to?", "(A) Neutrons, (B) Electrons, (C) Protons, (D) Neurons", "B");
        questions q7 = new questions("Question 7: If a circuit had a Voltage of 40 V and 2 Resistors of 5 and 2.5 ohms (series), what is the current?", "(A) 5.33 A, (B) 5.33 I, (C) 5.00 A, (D) 5.00 I", "A");
        questions q8 = new questions("Question 8: What is the value of an elementary charge in terms of coulombs (in terms of E)?", "(A) 1.6E^19, (B) -1.6E^19, (C) 1.6E^-19, (D) -1.6E^-19", "C");
        questions q9 = new questions("Question 9: What does K stand for in terms of springs?", "(A) Kinetic Coefficient, (B) Spring Displacement, (C) Friction, (D) Spring Constant", "D");
        questions q10 = new questions("Question 10: What equation is used to find refracted angle?", "(A)n2*sin(θ1) = sin(θ2)*n1 , (B) n1*sin(θ1) = n2*sin(θ2), (C) sin(θ1)*sin(θ2) = n1 * n2 , (D) n1*sin(θ1)*n2  sin(θ2)", "B");


        System.out.println(q1.state());
        System.out.println(q1.choices());
        answer = scan.nextLine();
        int i = 0;
        while (i == 0) {
            if (answer.equals(q1.returnY())) {
                System.out.println("Correct");
                i++;
            } else {
                System.out.println("Try again (Remember ! Uppercase)");
                answer = scan.nextLine();
            }
        }
        System.out.println(q2.state());
        System.out.println(q2.choices());
        answer = scan.nextLine();
        while (i == 1) {
            if (answer.equals(q2.returnY())) {
                System.out.println("Correct");
                i++;
            } else {
                System.out.println("Try again (Remember ! Uppercase)");
                answer = scan.nextLine();
            }
        }

        System.out.println(q3.state());
        System.out.println(q3.choices());
        answer = scan.nextLine();
        while (i == 2) {
            if (answer.equals(q3.returnY())) {
                System.out.println("Correct");
                i++;
            } else {
                System.out.println("Try again (Remember ! Uppercase)");
                answer = scan.nextLine();
            }
        }
        System.out.println(q4.state());
        System.out.println(q4.choices());
        answer = scan.nextLine();
        while (i == 3) {
            if (answer.equals(q4.returnY())) {
                System.out.println("Correct");
                i++;
            } else {
                System.out.println("Try again (Remember ! Uppercase)");
                answer = scan.nextLine();
            }
        }
        System.out.println(q5.state());
        System.out.println(q5.choices());
        answer = scan.nextLine();
        while (i == 4) {
            if (answer.equals(q5.returnY())) {
                System.out.println("Correct");
                i++;
            } else {
                System.out.println("Try again (Remember ! Uppercase)");
                answer = scan.nextLine();
            }
        }
        System.out.println(q6.state());
        System.out.println(q6.choices());
        answer = scan.nextLine();
        while (i == 5) {
            if (answer.equals(q6.returnY())) {
                System.out.println("Correct");
                i++;
            } else {
                System.out.println("Try again (Remember ! Uppercase)");
                answer = scan.nextLine();
            }
        }
        System.out.println(q7.state());
        System.out.println(q7.choices());
        answer = scan.nextLine();
        while (i == 6) {
            if (answer.equals(q7.returnY())) {
                System.out.println("Correct");
                i++;
            } else {
                System.out.println("Try again (Remember ! Uppercase)");
                answer = scan.nextLine();
            }
        }
        System.out.println(q8.state());
        System.out.println(q8.choices());
        answer = scan.nextLine();
        while (i == 7) {
            if (answer.equals(q8.returnY())) {
                System.out.println("Correct");
                i++;
            } else {
                System.out.println("Try again (Remember ! Uppercase)");
                answer = scan.nextLine();
            }
        }
        System.out.println(q9.state());
        System.out.println(q9.choices());
        answer = scan.nextLine();
        while (i == 8) {
            if (answer.equals(q9.returnY())) {
                System.out.println("Correct");
                i++;
            } else {
                System.out.println("Try again (Remember ! Uppercase)");
                answer = scan.nextLine();
            }
        }
        System.out.println(q10.state());
        System.out.println(q10.choices());
        answer = scan.nextLine();
        while (i == 9) {
            if (answer.equals(q10.returnY())) {
                System.out.println("Correct");
                i++;
            } else {
                System.out.println("Try again (Remember ! Uppercase)");
                answer = scan.nextLine();
            }
        }
        if (future){
            System.out.println(q11.state());
            System.out.println(q11.choices());
            answer = scan.nextLine();
            while (i == 1) {
                if (answer.equals(q1.returnY())) {
                    System.out.println("Correct");
                    i++;
                } else {
                    System.out.println("Try again (Remember ! Uppercase)");
                    answer = scan.nextLine();
                }
            }
        }
        System.out.println("Well Done!!! :D");
    }



}






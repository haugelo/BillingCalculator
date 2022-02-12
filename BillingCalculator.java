import java.util.*;
public class BillingProgram {
    public static void main(String args[]) {
        try {
            Register();
        }
        catch(Exception e){
            System.out.print("Invalid input. Input must be a number. Please try again. \n");
            Register();
        }
    }
    
    public static void loop(){
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to go back to main menu? [Y/N]: ");
        String ans = input.next();
        if ("Y".equals(ans) || "y".equals(ans))
            Register();
        else
            System.exit(0);
    }
    
    public static void Register() {
        String name, course, labcode;
        int studentNumber, yearLevel, units;
        float enrollmentFee, miscFee, tuitionFee;
        int labA = 2300, labB = 3350, labC = 4100, labD = 4320;
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nStudent Number: ");
        studentNumber = input.nextInt();
        System.out.print("Student Name: ");
        name = input.nextLine();
        System.out.print("Course: ");
        course = input.nextLine();
        System.out.print("Year Level[1-4]: ");
        yearLevel = input.nextInt();
        System.out.print("Number of Units: ");
        units = input.nextInt();
        System.out.print("Laboratory Code: ");
        labcode = input.next();
        
        System.out.println("\n\n-----------------REGISTRATION-----------------\n");
        
        switch(yearLevel) {
            case 1:
                enrollmentFee = units * 1021;
                miscFee = (float) (enrollmentFee * .18);

                System.out.println("Student: " + name);
                System.out.println("Student Number: " + studentNumber);
                System.out.println("Course: " + course);
                System.out.println("Year Level: " + yearLevel);
                System.out.println("No. of Units: " + units);
                System.out.println("Enrollment Fee: P " + enrollmentFee);
                System.out.println("Miscellaneous Fee: P " + miscFee);
                switch (labcode) {
                    case "A":
                        System.out.println("Laboratory Fee: P " + labA);
                        tuitionFee = enrollmentFee + miscFee + labA;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "B":
                        System.out.println("Laboratory Fee: P " + labB);
                        tuitionFee = enrollmentFee + miscFee + labB;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "C":
                        System.out.println("Laboratory Fee: P " + labC);
                        tuitionFee = enrollmentFee + miscFee + labC;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "D":
                        System.out.println("Laboratory Fee: P " + labD);
                        tuitionFee = enrollmentFee + miscFee + labD;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                }
                
                case 2:
                enrollmentFee = units * 1021;
                miscFee = (float) (enrollmentFee * .20);

                System.out.println("Student: " + name);
                System.out.println("Student Number: " + studentNumber);
                System.out.println("Course: " + course);
                System.out.println("Year Level: " + yearLevel);
                System.out.println("No. of Units: " + units);
                System.out.println("Enrollment Fee: P " + enrollmentFee);
                System.out.println("Miscellaneous Fee: P " + miscFee);
                switch (labcode) {
                    case "A":
                        System.out.println("Laboratory Fee: P " + labA);
                        tuitionFee = enrollmentFee + miscFee + labA;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "B":
                        System.out.println("Laboratory Fee: P " + labB);
                        tuitionFee = enrollmentFee + miscFee + labB;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "C":
                        System.out.println("Laboratory Fee: P " + labC);
                        tuitionFee = enrollmentFee + miscFee + labC;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "D":
                        System.out.println("Laboratory Fee: P " + labD);
                        tuitionFee = enrollmentFee + miscFee + labD;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                }

                case 3:
                enrollmentFee = units * 1021;
                miscFee = (float) (enrollmentFee * .23);

                System.out.println("Student: " + name);
                System.out.println("Student Number: " + studentNumber);
                System.out.println("Course: " + course);
                System.out.println("Year Level: " + yearLevel);
                System.out.println("No. of Units: " + units);
                System.out.println("Enrollment Fee: P " + enrollmentFee);
                System.out.println("Miscellaneous Fee: P " + miscFee);
                switch (labcode) {
                    case "A":
                        System.out.println("Laboratory Fee: P " + labA);
                        tuitionFee = enrollmentFee + miscFee + labA;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "B":
                        System.out.println("Laboratory Fee: P " + labB);
                        tuitionFee = enrollmentFee + miscFee + labB;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "C":
                        System.out.println("Laboratory Fee: P " + labC);
                        tuitionFee = enrollmentFee + miscFee + labC;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "D":
                        System.out.println("Laboratory Fee: P " + labD);
                        tuitionFee = enrollmentFee + miscFee + labD;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                }

                case 4:
                enrollmentFee = units * 1021;
                miscFee = (float) (enrollmentFee * .26);

                System.out.println("Student: " + name);
                System.out.println("Student Number: " + studentNumber);
                System.out.println("Course: " + course);
                System.out.println("Year Level: " + yearLevel);
                System.out.println("No. of Units: " + units);
                System.out.println("Enrollment Fee: P " + enrollmentFee);
                System.out.println("Miscellaneous Fee: P " + miscFee);
                switch (labcode) {
                    case "A":
                        System.out.println("Laboratory Fee: P " + labA);
                        tuitionFee = enrollmentFee + miscFee + labA;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "B":
                        System.out.println("Laboratory Fee: P " + labB);
                        tuitionFee = enrollmentFee + miscFee + labB;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "C":
                        System.out.println("Laboratory Fee: P " + labC);
                        tuitionFee = enrollmentFee + miscFee + labC;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                    case "D":
                        System.out.println("Laboratory Fee: P " + labD);
                        tuitionFee = enrollmentFee + miscFee + labD;
                        System.out.println("Tuition Fee: " + tuitionFee);
                        loop();
                        break;
                }
                
        }
    }
}

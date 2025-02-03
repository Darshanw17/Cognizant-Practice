import java.util.Scanner;

class College{
    public static void main(String[] args) {
        int CSE ;
        int ECE ;
        int MECH ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        CSE = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        ECE = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        MECH = sc.nextInt();
        if(CSE < 0 || ECE < 0 || MECH < 0){
            System.out.println("Input is Invalid");
        }
        else if(CSE == ECE && ECE == MECH){
            System.out.println("None of the department has got the highest placement");
        }
        else if(CSE > ECE && CSE > MECH){
            System.out.println("Highest placement");
            System.out.println("CSE");
        }
        else if(ECE > CSE && ECE > MECH){
            System.out.println("Highest placement");
            System.out.println("ECE");
        }
        else if(MECH > CSE && MECH > ECE){
            System.out.println("Highest placement");
            System.out.println("MECH");
        }
        else if(CSE == ECE && CSE > MECH){
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("ECE");
        }
        else if(CSE == MECH && CSE > ECE){
            System.out.println("Highest placement");
            System.out.println("CSE");
            System.out.println("MECH");
        }
        else if(ECE == MECH && ECE > CSE){
            System.out.println("Highest placement");
            System.out.println("ECE");
            System.out.println("MECH");
        }
        sc.close();
    
    }
}
import java.util.Scanner;

class Movie{
    public static void main(String[] args) {
     int Pizza = 100;
     int puff = 20;
     int colddrinks  = 10; 
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pizzas bought:");
        int p = sc.nextInt();
        System.out.println("Enter the number of puffs bought:") ;
        int puf = sc.nextInt();
        System.out.println("Enter the number of cool drinks bought:");
        int cd = sc.nextInt();
        int total = (Pizza*p) + (puff*puf) + (colddrinks*cd);
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+p);
        System.out.println("No of puffs:"+puf);
        System.out.println("No of cooldrinks:"+cd);
        System.out.println("Total price="+total);
        System.out.println("ENJOY THE SHOW!!!");
        sc.close();
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Student hanterings program");


        List<Student> studenter = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        int index = 0; //håller reda på antal studenter som finns i arrayen

        boolean status = true;

        while (status) {
            System.out.println("1) Lägg till student");
            System.out.println("2) Visa alla studenter");
            System.out.println("3) Ta bort student");
            System.out.println("4) Avsluta programmet");

            int choice;

            choice = scanner.nextInt();


            if (choice == 1) {

                System.out.println("Ange id: ");
                int id = scanner.nextInt();
                System.out.println("Ange förnamn:");
                String förNamn = scanner.next();
                System.out.println("Ange efternamn:");
                String efterNamn = scanner.next();

                System.out.println("Ange födelse år: ");
                int födelseÅr = scanner.nextInt();
                System.out.println("Ange adress: ");
                String adress = scanner.next();
                System.out.println("Ange mail adress: ");
                String mailAdress = scanner.next();

                Student s = new Student(id, förNamn,efterNamn,födelseÅr,adress, mailAdress);
                studenter.add(s);

            }

            if(choice == 2)
            {
                if(studenter.isEmpty())
                {
                    System.out.println("Finns inga studenter att visa.");
                }else {
                    Student.visaStudenter(studenter);
                }
            }

            if(choice == 3)
            {
                if(!studenter.isEmpty())
                {
                    System.out.println("Ange id för student du vill ta bort: ");
                    int findId = scanner.nextInt();

                    for(Student s : studenter)
                    {
                        if(s.getId() == findId)
                        {
                            Student.taBortStudent(findId, studenter);
                        }
                    }
                }
            }

            if(choice == 4)
            {
                status = false;
            }
        }

    }
}

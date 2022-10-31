import java.util.ArrayList;
import java.util.Scanner;

//Komang Andika Wira Santosa
//2501994424

public class Main {
    public static void main(String[] args)
    {
        int opt = 0;

        Scanner komang = new Scanner(System.in);


        ArrayList<String> cname = new ArrayList<String>();
        ArrayList<String> cpass = new ArrayList<String>();
        ArrayList<String> cphone = new ArrayList<String>();

        int num_remove = 0;

        while (opt != 4) {
            System.out.println("+------------------------------+");
            System.out.println("|             Menu             |");
            System.out.println("+------------------------------+");
            System.out.println("|1.Input Data                  |");
            System.out.println("|2.Show Data                   |");
            System.out.println("|3.Delete Data                 |");
            System.out.println("|4.Exit                        |");
            System.out.println("+------------------------------+");
            System.out.print("Enter option: ");
            opt = komang.nextInt();
            komang.nextLine();

            //Inputting data
            if (opt == 1){
                Integer input_size = 3;
                String[] input = {"Name", "Pass", "Phone"};
                for (int j=0;j<input_size;j++){
                    if (j==0){
                        System.out.print("Name: ");
                        input[j]=komang.nextLine();
                    }
                    else if(j==1){
                        System.out.print("Pass: ");
                        input[j]=komang.nextLine();
                    }
                    else if(j==2){
                        System.out.print("Phone: ");
                        input[j]=komang.nextLine();
                    }
                }

                cname.add(input[0]);
                cpass.add(input[1]);
                cphone.add(input[2]);

                System.out.println("New data is added");
            }

            //Showing data
            if (opt == 2){
                for (int i=0; i<cname.size();i++) {
                    System.out.println("+----+------------------+------------------+-------------------+");
                    System.out.println("| No |       Name       |       Pass       |       Phone       |");
                    System.out.println("+----+------------------+------------------+-------------------+");
                    System.out.format("| %-2d ",i+1);
                    System.out.format("|%-18s|",cname.get(i));
                    System.out.format("%-18s|",cpass.get(i));
                    System.out.format("%-19s|",cphone.get(i));
                    System.out.println();
                }
                System.out.println("+----+------------------+------------------+-------------------+");

            }

            //Deleting data
            if (opt == 3){
                System.out.print("Input data number to be deleted: ");
                num_remove = komang.nextInt();

                //Check if there is element on the index
                if (num_remove-1 > cname.size()){
                    System.out.println("Invalid number");
                } else {
                    cname.remove(num_remove);
                    cpass.remove(num_remove);
                    cphone.remove(num_remove);
                    System.out.println("Data is removed");
                }
            }

            //Exit
            if (opt == 4){
                System.out.println("Thank you for using our service");
                break;
            }
        }
    }
}

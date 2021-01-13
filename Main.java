import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter forename, surname, maiden name and city");

    String forename = input.nextLine();
    String surname = input.nextLine();
    String maidenName = input.nextLine();
    String city = input.nextLine();

    String firstName1 =  surname.substring(0,3);
    String firstName2 =  forename.substring(0,2);
    String lastName1 =  maidenName.substring(0,3);
    String lastName2 =  city.substring(0,2);


    System.out.println("Your star wars name is " + firstName1 + firstName2 + " " + lastName1 + lastName2);


  
  }
}
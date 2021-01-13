import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter forename, surname, maiden name and city");

    String forename = input.nextLine();
    String surname = input.nextLine();
    String maidenName = input.nextLine();
    String city = input.nextLine();

    String a =  forename.substring(0,3).toLowerCase();
    String b =  surname.substring(0,2).toLowerCase();
    String c =  maidenName.substring(0,3).toLowerCase();
    String d =  city.substring(0,2).toLowerCase();

    String starWarsName = a + b + c + d;

    System.out.println("Your star wars name is " + starWarsName);


  
  }
}
public class MadLibsClone
{
  public static void main(String[] args)
  {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String adj1, g_name, adj2, occ1, place, clothing, hobby, adj3, occ2, b_name, m_name;

    System.out.print("Enter an adjective: ");
    adj1 = scanner.nextLine();

    System.out.print("Enter a name: ");
    g_name = scanner.nextLine();

    System.out.print("Enter another adjective: ");
    adj2 = scanner.nextLine();

    System.out.print("Enter an occupation: ");
    occ1 = scanner.nextLine();

    System.out.print("Enter the name of place: ");
    place = scanner.nextLine();

    System.out.print("Enter an item of clothing: ");
    clothing = scanner.nextLine();

    System.out.print("Enter a hobby: ");
    hobby = scanner.nextLine();

    System.out.print("Enter an adjective: ");
    adj3 = scanner.nextLine();

    System.out.print("Enter an occupation: ");
    occ2 = scanner.nextLine();

    System.out.print("Enter a name: ");
    b_name = scanner.nextLine();

    System.out.print("Finally, enter a name: ");
    m_name = scanner.nextLine();

    System.out.print("There once was a " + adj1 + " girl named " + g_name + ", who was a ");
    System.out.print(adj2 + " " + occ1 + " in the Kingdom of " + place + ".\nShe loved to ");
    System.out.print("wear " + clothing + " and to " + hobby + ". She wanted to marry the ");
    System.out.print(adj3 + " " + occ2 + " named " + b_name + " but her father, King " + m_name);
    System.out.println(" forbid her from seeing him.");
  }
}

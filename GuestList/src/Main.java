import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);
//    static int option = 0;

    public static void main(String[] args) {

        insertTestNames();

        do {

            displayGuests();
            displayMenu();
            int option = getOption();

            switch(option) {

                case 1:
                    addGuest();
                    break;

                case 2:
                    renameGuest();
                    break;

                case 3:
                    removeGuest();
                    break;

            }

            if (option == 4) {
                break;
            }

        } while (true);

    };


    // methods for main method


    static void insertTestNames() {

        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";
        guests[5] = "Bobby Hills";
        guests[6] = "David Hart";
        guests[7] = "Sarah Silver";
        guests[8] = "Katty Noman";
        guests[9] = "Jerry Something";

    }

    static void displayGuests() {

        System.out.println("\n- Guests -\n");
//        boolean isEmpty = true;

        for (int i = 0; i < guests.length; i++) {

            if(guests[0] == null) {
                System.out.println("Guest list is Empty.");
                break;
            }
            else if(guests[i] != null) {
                System.out.format("%d. %s\n", i+1, guests[i]);
//                isEmpty = false;
            }

        };

//        if(isEmpty) {
//            System.out.println("Guest list is Empty.");
//        }
    };

    static void displayMenu() {
        System.out.println("______________________");
        System.out.println("- Menu -\n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Rename Guest");
        System.out.println("3 - Remove Guests");
        System.out.println("4 - Exit");
    };

    static int getOption() {
        System.out.print("Option: ");
        System.out.println("\n______________________");
        int option = scanner.nextInt();
        scanner.nextLine();
//        System.out.println();
        return option;
    }

    static void addGuest() {
        System.out.println("\n______________________");
        System.out.println("- Add a Guest -\n");

        if(guests[guests.length-1] != null) {
            System.out.println("All slots on the list are full.");
            System.out.println("Continuing will erase the last name on list.");
            System.out.println("Press 'y' if you want to continue.");
            String choice = scanner.next();

            if (choice.equals("y") || choice.equals("Y")) {

                guests[guests.length - 1] = null;
                System.out.println("Do you wish to place on a particular position on the list?");
                System.out.println("Choose 'y' if you do.");
                choice = scanner.next();

                if (choice.equals("y") || choice.equals("Y")) {
                    addOnPosition();
                }
                else {
                    scanner.nextLine();
                    guests[guests.length - 1] = scanner.nextLine();
                }
            } else {
                System.out.println("Exiting Add Guest Menu.");
            }
        } else {
            System.out.println("Do you wish to add guest on a particular position on the list?");
            System.out.println("Choose 'y' if you do.");
            String choice = scanner.next();

            if (choice.equals("y") || choice.equals("Y")) {
                addOnPosition();
            }
            else {
                for (int i = 0; i < guests.length; i++) {
                    if (guests[i] == null) {
                        System.out.print("Name: ");
                        scanner.nextLine();
                        guests[i] = scanner.nextLine();
                        break;
                    }
                }
            }
        }
    }

    static void addOnPosition() {
        System.out.println("Guest Number:");
        int num = scanner.nextInt();
        scanner.nextLine();


        for (int i = guests.length - 1; i >= num; i--) {
            guests[i] = guests[i - 1];
        }
        System.out.println("Guest Name: ");
        guests[num - 1] = scanner.nextLine();
    }

    static void renameGuest() {
        System.out.println("\n______________________");
        System.out.println("- Rename a Guest -\n");
        System.out.println("Guest Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if(num <= guests.length && num >= 1 && guests[num-1] != null ) {
            System.out.println("Name: ");
            guests[num-1] = scanner.nextLine();
        }
        else if(num <= guests.length && num >= 1 && guests[num-1] == null) {
            System.out.println("That slot is empty.");
            System.out.println("Do you wish to add a name?");
            System.out.println("Hit 'y' if you want to add a name to the list.");
            String add = scanner.next();
            if (add.equals("y") || add.equals("Y")) {
                scanner.nextLine();
                System.out.println("Name: ");
                guests[num-1] = scanner.nextLine();
                String[] temp = new String[guests.length];
                int ti = 0;
                for (String guest : guests) {
                    if (guest != null) {
                        temp[ti] = guest;
                        ti++;
                    }
                }
                guests = temp;
            }
            else {
                System.out.println("Ok, exiting rename option.");
            }
        }
        else {
            System.out.println("Number exceeds maximum number allowed on list.");
        };
    }

    static void removeGuest() {

        System.out.println("\n______________________");
        System.out.println("- Delete a Guest -\n");
        System.out.println("Number: ");
        int num = scanner.nextInt();

        if(num <= guests.length && num >= 1 && guests[num-1] != null ) {
            guests[num-1] = null;

            // Another solution for Exercise 8
            // moving elements to another array if names are not null
            // then have guests array copy temp array

            String[] temp = new String[guests.length];
            int ti = 0;
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null) {
                    temp[ti] = guests[i];
                    ti++;
                }
            };
            guests = temp;
        }
        else if(num <= guests.length && num >= 1 && guests[num-1] == null) {
            System.out.println("Slot is already empty.");
        }
        else {
            System.out.println("Number exceeds maximum number allowed on list.");
        };



    }

}

//            if (option == 1) {
//                addGuest();
//            }
//
//            else if (option == 2) {
//
//                renameGuest();
//            }
//
//            else if (option == 3) {
//                removeGuest();
//            }
//
//            else if (option == 4) {
//                break;
//            }


//        Set<String> nullCheck = new HashSet<String>(Arrays.asList(guests));

//        if(guests[0] == null) {
//            System.out.println("Guest list is Empty.");
//        } else {
//            System.out.format("%d. %s\n", 1, guests[0]);
//        };

//          if(guests[i] == null) {
//              guests[i] = "--";
//          }
//          System.out.println(guests[i]);
//            if ( i < guests.length-1 && guests[i +1] != null && guests[i] == null) {
//                guests[i] = guests[i+1];
//                guests[i +1] = null;
//            }
//            System.out.println( (i + 1) + ". " + (guests[i] == null ? "--" : guests[i]));


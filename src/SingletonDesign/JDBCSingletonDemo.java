package SingletonDesign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JDBCSingletonDemo {
    static int count =1;
    static int choice;

    public static void main(String[] args) throws IOException {
        JDBCSingleton jdbc = JDBCSingleton.getInstance();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("DATA BASE OPERATIONS");
            System.out.println("------------------");
            System.out.println("1.Insertion");
            System.out.println("2.view");
            System.out.println("3.delete");
            System.out.println("4.update");
            System.out.println("5.exit");

            System.out.println("\n");
            System.out.println("please enter the choice what you want to perform in the database:");

            choice = Integer.parseInt(br.readLine());
            switch (choice) {

                case 1: {
                    System.out.println("");
                    String username = br.readLine();
                    System.out.println("");
                    String password = br.readLine();

                    try {
                        int i = jdbc.insert(username, password);
                        if (i > 0) {
                            System.out.println((count++) + "Data has been inserted succesfully");
                        } else {
                            System.out.println("Data has been inserted");
                        }


                    } catch (Exception e) {
                        System.out.println(e);
                    }

                    System.out.println("Press enter key to continue: ");
                    System.in.read();

                }// end case 1
                break;

                case 2: {
                    System.out.println("Enter the username");
                    String username = br.readLine();

                    try {
                        jdbc.view(username);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("Press Enter key to continue");
                    System.in.read();


                } // end case 2
                break;

                case 3: {
                    System.out.println("Enter the userid, you want to delete: ");
                    int userid = Integer.parseInt(br.readLine());


                    try {
                        int i = jdbc.delete(userid);
                        if (i > 0) {
                            System.out.println((count++) + "Data has been deleted successfully");
                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("Press Enter key to continue");
                    System.in.read();
                }  // end of case 3
                break;

                case 4: {
                    System.out.println("Enter the username , you want to update: ");
                    String username = br.readLine();
                    System.out.println("Enter the new password");
                    String password = br.readLine();


                    try {
                        int i = jdbc.update(username, password);
                        if (i > 0) {
                            System.out.println((count++) + "Data has been updated successfully");
                        }


                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("Press Enter key to continue.");
                    System.in.read();
                } // end case of 4
                break;

                default:
                    return;
            }

        } while(choice != 4);
    }
}

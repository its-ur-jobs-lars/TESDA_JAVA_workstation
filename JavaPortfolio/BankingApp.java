package JavaPortfolio;

import java.util.HashMap;
import java.util.Scanner;

class User {
        private int id;
        private int pin;
        private String name;
        private double balance;

        public User(int id, int pin, String name, double balance) {
             this.id = id;
             this.pin = pin;
             this.name = name;
             this.balance = balance;
        }

        public int getId() {
              return id;
         }

        public int getPin() {
              return pin;
        }

        public String getName() {
                 return name;
                     }

        public double getBalance() {
                    return balance;
         }

                           
         public void setBalance(double balance) {
                    this.balance = balance;
        }
     }

     class Bank {
        private HashMap<Integer, User> users = new HashMap<>();
        private User loggedUser = null;

        public void addUser(int id, int pin, String name, double balance) {
            if (users.containsKey(id)) {
               System.out.println("User ID already exists. Choose a unique ID.");
           } else {
            users.put(id, new User(id, pin, name, balance));
               System.out.println("New user added successfully.");
                  }
               }

    public boolean login(int id, int pin) {
            if (users.containsKey(id) && users.get(id).getPin() == pin) {
               loggedUser = users.get(id);
                 System.out.println("Welcome, " + loggedUser.getName() + "!");
               return true;
           } else {
                 System.out.println("Invalid ID or PIN.");
              return false;
          }
         } 
         
         public void checkBalance() {
             if (loggedUser != null) {
                System.out.println("Your balance is: P" + loggedUser.getBalance());
             } else {
                System.out.println("Please log in first.");
             }
            }

          
         public void cashIn(double amount) {
              if (loggedUser != null) {
              if (amount > 0) {
                   loggedUser.setBalance(loggedUser.getBalance() + amount);
                        System.out.println("Cash-in successful. New balance: $" + loggedUser.getBalance());
                   } else {
                        System.out.println("Invalid amount.");
                   }
                   } else {
                        System.out.println("Please log in first.");
                   }
                  }


          public void moneyTransfer(int receiverId, double amount) {
               if (loggedUser != null) {
                  if (users.containsKey(receiverId)) {
                       if (amount > 0 && amount <= loggedUser.getBalance()) {
                              User receiver = users.get(receiverId);
                              loggedUser.setBalance(loggedUser.getBalance() - amount);
                              receiver.setBalance(receiver.getBalance() + amount);
                              System.out.println("Transfer successful. New balance: $" + loggedUser.getBalance());
                      } else {
                              System.out.println("Invalid amount or insufficient balance.");
                      }
                      } else {
                               System.out.println("Receiver ID not found.");
                      }
                      } else {
                         System.out.println("Please log in first.");
                     }
                 }
             
                 public void logout() {
                     loggedUser = null;
                     System.out.println("Logged out successfully.");
                 }

                 public void viewAllUsers() {
                  if (users.isEmpty()) {
                      System.out.println("No users available.");
                  } else {
                      System.out.println("List of all users:");
                      for (User user : users.values()) {
                          System.out.println(user);
                      }
                  }
              }
             }

      public class BankingApp{
         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Bank bank = new Bank();
            boolean isLoggedIn = false;
    
            while (true) {
                System.out.println("\n--- Banking App ---");
                System.out.println("1. Login");
                System.out.println("2. Check Balance");
                System.out.println("3. Cash-In");
                System.out.println("4. Money Transfer");
                System.out.println("5. Add New User");
                System.out.println("6. View All Users");
                System.out.println("7. Logout");
                System.out.println("8. Exit");
                System.out.print("Select an option: ");
                int choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        System.out.print("Enter User ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter PIN: ");
                        int pin = scanner.nextInt();
                        isLoggedIn = bank.login(id, pin);
                        break;
                    case 2:
                        if (isLoggedIn) bank.checkBalance();
                        else System.out.println("Please log in first.");
                        break;
                    case 3:
                        if (isLoggedIn) {
                            System.out.print("Enter amount to cash-in: ");
                            double amount = scanner.nextDouble();
                            bank.cashIn(amount);
                        } else {
                            System.out.println("Please log in first.");
                        }
                        break;
                    case 4:
                        if (isLoggedIn) {
                            System.out.print("Enter receiver's User ID: ");
                            int receiverId = scanner.nextInt();
                            System.out.print("Enter amount to transfer: ");
                            double transferAmount = scanner.nextDouble();
                            bank.moneyTransfer(receiverId, transferAmount);
                        } else {
                            System.out.println("Please log in first.");
                        }
                        break;
                    case 5:
                        System.out.print("Enter new User ID: ");
                        int newId = scanner.nextInt();
                        System.out.print("Enter new User PIN: ");
                        int newPin = scanner.nextInt();
                        scanner.nextLine();  // Consume newline
                        System.out.print("Enter new User Name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter initial balance: ");
                        double newBalance = scanner.nextDouble();
                        bank.addUser(newId, newPin, newName, newBalance);
                        break;
                    case 6:
                    bank.viewAllUsers();
                    break;
                    case 7:
                        bank.logout();
                        isLoggedIn = false;
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }
      }
         
         

         
       
             


              
                     
                 
                     
                 
                
                  
                                                                                   
                  


         
       


       

    

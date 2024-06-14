package bitcamp.myapp;


import java.util.ArrayList;
import java.util.Scanner;

    public class Test {
        static class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Name: " + name + ", Age: " + age;
            }
        }

        public static void main(String[] args) {
            ArrayList<Person> persons = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("Choose an option:");
                System.out.println("1. Create");
                System.out.println("2. Read");
                System.out.println("3. Update");
                System.out.println("4. Delete");
                System.out.println("5. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume the newline

                switch (choice) {
                    case 1:
                        System.out.println("Enter name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter age:");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // consume the newline
                        persons.add(new Person(name, age));
                        System.out.println("Person added.");
                        break;
                    case 2:
                        System.out.println("Persons list:");
                        for (int i = 0; i < persons.size(); i++) {
                            System.out.println((i + 1) + ". " + persons.get(i));
                        }
                        break;
                    case 3:
                        System.out.println("Enter the index of the person to update:");
                        int indexToUpdate = scanner.nextInt() - 1;
                        scanner.nextLine(); // consume the newline
                        if (indexToUpdate >= 0 && indexToUpdate < persons.size()) {
                            System.out.println("Enter new name:");
                            String newName = scanner.nextLine();
                            System.out.println("Enter new age:");
                            int newAge = scanner.nextInt();
                            scanner.nextLine(); // consume the newline
                            persons.get(indexToUpdate).name = newName;
                            persons.get(indexToUpdate).age = newAge;
                            System.out.println("Person updated.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the index of the person to delete:");
                        int indexToDelete = scanner.nextInt() - 1;
                        scanner.nextLine(); // consume the newline
                        if (indexToDelete >= 0 && indexToDelete < persons.size()) {
                            persons.remove(indexToDelete);
                            System.out.println("Person deleted.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                        break;
                    case 5:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }

            scanner.close();
            System.out.println("Program exited.");
        }
    }



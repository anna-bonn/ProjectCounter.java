public class Main {
    public static void main(String[] args) {
        

        String start = IO.readln("Would you like to start a project?");
        if (start.equals("yes")) {
            String name = IO.readln("What is the name of your project?");
            IO.println("Starting project: " + name);
            int count = Integer.parseInt(IO.readln("How many stiches do you want to make?"));

        } else {
            IO.println("Project not started.");
            return;
        }
    }
}

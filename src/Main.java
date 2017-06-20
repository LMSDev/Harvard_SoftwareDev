public class Main {

    public static void main(String[] args) {
        if (args.length != 1)  System.out.println(args.length == 0 ? "No name passed" : "Too many arguments");
        else System.out.println("Hello, " + args[0]);
    }
}

package net.ninjaworks.ai;

public class AI {
    public void main(String[] args) {
        if(!(args.length == 0)) {
            if(args[0].equals("-build")) {
                if(args[1].equals("new")) {

                }
            } else {
                System.out.println("Invalid first argument!");
            }
        } else {
            System.out.println("Please provide at least one argument!");
        }
    }

    private static void build(String[] args) {
        if(args[1].equals("old")) {

        } else if (args[1].equals("new")) {

        } else {
            System.out.println("Invalid build argument : " + args[1] + ". Use old or new network");
        }
    }
}

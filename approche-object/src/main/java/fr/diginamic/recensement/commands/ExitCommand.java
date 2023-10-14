package fr.diginamic.recensement.commands;

public class ExitCommand implements Command {
  public ExitCommand() {
    System.out.println("9. Exit");
  }

  @Override
  public void execute() {
    System.out.println("-------");
    System.out.println("9. Exit");
    System.out.println("-------");

    System.out.println("Exiting the program...completed");
    System.out.println("[Process completed]");
  }
}

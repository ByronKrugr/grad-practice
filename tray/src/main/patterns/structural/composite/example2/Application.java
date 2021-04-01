package patterns.structural.composite.example2;

public class Application {

  public static void main(String[] args) {
    Composite team1 = new Composite();
    team1.add(new Manager("Saurabh"));
    team1.add(new Developer("Taylor"));
    team1.add(new Developer("Rob"));

    Composite team2 = new Composite();
    team2.add(new Manager("Jake"));
    team2.add(new Manager("Kenny"));
    team2.add(new Developer("Paul"));

    Composite company = new Composite();
    company.add(new Developer("John"));
    company.add(team1);
    company.add(team2);

    System.out.println(company.getEmployeeDetails());
  }
}

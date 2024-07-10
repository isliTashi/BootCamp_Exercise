package inheritanceChallenge;

public class Main {
    public static void main(String[] args) {
        Employee isli = new Employee("Isli", "1/1/2023",
                7801,"1/1/2024");
        System.out.println(isli);
        System.out.println("Age = " + isli.getAge());
        System.out.println("pay = " + isli.collectPay());
    }
}

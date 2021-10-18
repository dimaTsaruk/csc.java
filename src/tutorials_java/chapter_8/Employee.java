package tutorials_java.chapter_8;

public class Employee {
    private int empNum;
    private double empSal;

    Employee(int e, double s) {
        empNum = e;
        empSal = s;
    }

    public int getEmpNum() {
        return empNum;
    }

    public double getEmpSal() {
        return empSal;
    }

    public static void main(String[] args) {
        Employee[] emps = new Employee[7];
        final int START_NUM = 101;
        final double STARTING_SALARY = 15_000;
        for (int x = 0; x < emps.length; x++)
            emps[x] = new Employee(START_NUM + x, STARTING_SALARY);

        for (int x = 0; x < emps.length; ++x)
            System.out.println(emps[x].getEmpNum() + " " +
                    emps[x].getEmpSal());
        for (Employee workers : emps)
            System.out.println(workers.getEmpNum() + " " + workers.getEmpSal());
    }
}

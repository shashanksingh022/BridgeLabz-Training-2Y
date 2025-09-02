public class EmployeeBonus {
    public static void main(String[] args) {
        double[][] data = new double[10][4]; // salary, years, bonus, newSalary
        double totalOld=0, totalNew=0, totalBonus=0;

        for (int i=0;i<10;i++) {
            data[i][0] = 10000 + (int)(Math.random()*90000);
            data[i][1] = 1 + (int)(Math.random()*10);

            if (data[i][1] > 5) data[i][2] = data[i][0]*0.05;
            else data[i][2] = data[i][0]*0.02;

            data[i][3] = data[i][0]+data[i][2];
            totalOld += data[i][0];
            totalNew += data[i][3];
            totalBonus += data[i][2];
        }

        System.out.println("Salary  Years  Bonus  NewSalary");
        for (int i=0;i<10;i++) {
            System.out.println(data[i][0]+"   "+data[i][1]+"   "+data[i][2]+"   "+data[i][3]);
        }
        System.out.println("Total Old="+totalOld+" New="+totalNew+" Bonus="+totalBonus);
    }
}

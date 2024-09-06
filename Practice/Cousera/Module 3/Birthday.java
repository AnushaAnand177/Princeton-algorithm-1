public class Birthday {
    public static void main(String[] args) {

        int totalPeople = Integer.parseInt(args[0]);
        int totalDays = Integer.parseInt(args[1]);

        double person1 = Math.random() * totalDays;

        int count = 1;
        int trial = 0;
        double fraction = 0;
        System.out.printf("%d      %d      %.1f\n", count, trial, fraction);
        while (totalPeople > 1) {
           double people = Math.random() * totalDays;
            count++;
                if (person1 == people) {
                    trial = count;
                    fraction = (double)trial / totalPeople;
                    System.out.printf("%d      %d      %.6f\n", count, trial, fraction);
                    if (fraction > 0.5) {
                        break;
                    }
                }
            totalPeople--;
        }
    }
}
/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double r = 6371.0; // Radius of the Earth in kilometers
        double dLat = Math.toRadians(x2 - x1);
        double dLon = Math.toRadians(y2 - y1);
        double rLat1 = Math.toRadians(x1);
        double rLat2 = Math.toRadians(x2);

        double sinDLat = Math.sin(dLat / 2);
        double sinDLon = Math.sin(dLon / 2);

        double a = sinDLat * sinDLat
                + Math.cos(rLat1) * Math.cos(rLat2)
                * sinDLon * sinDLon;

        // Clamp 'a' to the range [0, 1] to prevent issues with floating-point precision
        a = Math.min(1.0, Math.max(0.0, a));

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // Perform multiplication with higher precision
        double distance = r * c;
        // Output the distance
        System.out.printf("%.16e kilometers%n", distance);
    }
}

/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        // formula: a^2 + b^2 = c^2
        // (where : a = base, b = perpendicular, c = hypotenuse)
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // Use long to avoid overflow
        long x, y, z;
        x = (long) a * a;
        y = (long) b * b;
        z = (long) c * c;
        // Check if any of the sides are zero
        boolean isZero = ((x == 0) && (y == 0) && (z == 0));
        // Check if any of the sides are negative
        boolean hasNegative = (a < 0) || (b < 0) || (c < 0);
        // Check if the sides form a right-angled triangle
        boolean isRightAngleTriangle = (((x + y) == z) || ((z + x) == y) || ((y + z) == x));
        // Final condition: No zeros, no negative values, and it's a right triangle
        boolean isRightAngle = (!isZero) && (!hasNegative) && (isRightAngleTriangle);
        System.out.println(isRightAngle);
    }
}

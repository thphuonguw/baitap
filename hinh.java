package test;

public class hinh {
    public class TriangleTypeChecker {

        public String checkTriangleType(int a, int b, int c) {
            if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
                return "NotATriangle";
            }
            if ((a == b) && (b == c)) {
                return "Equilateral";
            }
            if ((a == b) || (b == c) || (a == c)) {
                return "Isosceles";
            }
            if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                return "RightTriangle";
            }
            return "Scalene";
        }

        public static String triangle_type(int i, int j, int k) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'triangle_type'");
        }
    }
}

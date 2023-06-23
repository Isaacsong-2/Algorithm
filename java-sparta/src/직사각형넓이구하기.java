public class 직사각형넓이구하기 {
    public int solution(int[][] dots) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxX = Math.max(maxX, dot[0]);
            maxY = Math.max(maxY, dot[1]);
        }

        int width = maxX - minX;
        int height = maxY - minY;

        int area = width * height;
        return area;
    }

    public static void main(String[] args) {
        직사각형넓이구하기 sol = new 직사각형넓이구하기();
        int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        sol.solution(dots);
    }
}

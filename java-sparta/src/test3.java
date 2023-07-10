public class test3 {
    private static final int WIDTH = 10;
    private static final int DECIMAL_POINT = 2;

    public static void main(String[] args) {
        Object[][] records = {
                {"AAA", 1.23456, 123456},
                {"BBBBB", 12.3, 123},
                {"CCCC", 123.4, 1234}
        };

        test3 test = new test3();
        test.printRecord(records);
    }

    private void printRecord(Object[][] records) {
        for (Object[] record : records) {
            System.out.print("|");
            for (Object data : record) {
                String formattedData = formatData(data);
                System.out.print(formattedData);
            }
            System.out.println();
        }
    }

    private String formatData(Object data) {
        if (data instanceof String) return String.format("%-" + WIDTH + "s" + "|", (String) data);
        else return String.format("%" + WIDTH + "." + DECIMAL_POINT + "f" + "|", Float.valueOf(String.valueOf(data)));
    }

}

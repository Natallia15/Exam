public class Main {
    public static void main(String[] args) {
        int a = 30;
        int i = 15;
        try {
            if (i == 15)
                throw new MyException("Нельзя делить на 15");
        } catch (MyException ex) {
            System.out.println(ex.massage);

        } finally {
            System.out.println("если было бы можно :" + a / i);

        }
    }
}

public class App {
    interface Worker{
        void work();
    }
    static class Developer implements Worker{
        public void work(){
            System.out.println("writing code");
        }
    }

    static class Tester implements Worker{
        public void work(){
            System.out.println("test dev work");
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

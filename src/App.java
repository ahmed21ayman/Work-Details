public class App {
    interface Worker{
        void work();
    }
    static class Developer implements Worker{
        public void work(){
            System.out.println("writing code");
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

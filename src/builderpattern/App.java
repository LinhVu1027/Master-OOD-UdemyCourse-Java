package builderpattern;

public class App {

    public static void main(String[] args) {
        User websiteUser = new User.Builder("Cloud", "cloud@gmail.com").firstName("Allen").lastName("Walker").build();

        System.out.println(websiteUser);
    }
}

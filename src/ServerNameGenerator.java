import java.util.Random;

public class ServerNameGenerator {



    public static void serverName(){
         String[] adj = {"motivated", "smart", "speedy", "hard", "soft", "greasy", "dry", "slow", "lazy", "stinky"};
         String[] nouns = {"bunny", "rhino", "ardvark", "buffalo", "rat", "duck", "chicken", "dog", "cat", "snake"};
        int randomNoun = (int) (Math.random() * 10);
        int randomAdj = (int) (Math.random() * 10);
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", adj[randomAdj], nouns[randomNoun]);
    }


    public static void main(String[] args) {

        serverName();
    }

}

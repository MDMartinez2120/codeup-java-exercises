public class ServerNameGenerator {

    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

    private String[] adjectives = {"cold", "hot", "cool", "warm", "tall", "short", "big", "small", "wet", "dry"};

    private String[] nouns = {"car", "wheel", "paint", "hand", "stick", "shoe", "bike", "bench", "fountain", "shrub"};


    public String[] getNouns() {
        return nouns;
    }

    public String[] getAdjectives(){
        return adjectives;
    }

    private static String getString(String[] stringArray){
        return stringArray[(int) Math.ceil(Math.random() * stringArray.length - 1)];
    }

    public static void main(String[] args){
        ServerNameGenerator serverNameGenerator = new ServerNameGenerator();
        System.out.println("Here is the servers name");
        String noun = getString(serverNameGenerator.getNouns());
        String adjective = getString(serverNameGenerator.getAdjectives());
        System.out.printf("%s - %s", adjective, noun);
    }
}


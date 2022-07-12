package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        char[] vowels = {'a','e','o','i','u','y'};
        char[] consonant ={'q','w','r','t','p','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};

        for(char c :vowels){
            if(c == character){
                System.out.println("Vowel");
            }else {
                for(char b : consonant){
                    if(b == character){
                        System.out.println("Consonant");
                    }
                    else {
                        System.out.println("wrong alphabet");
                    }
                }
            }

        }
    }
}

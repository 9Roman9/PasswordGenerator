package Main;

import java.util.Random;

public class Java {
    Random random = new Random();
    String[] letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
            "a","b","c","d","e","f","g","h","i","j","k","l","m",
            "n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String[] symbols = {"!","@","#","$","%","^","&","*","(",")","_","+","-","="};
    String password = "";
    int typeDifferentiator;
    int letterDifferentiator;
    int symbolDifferentiator;

    public String generatePassword(){
        for(int i = 0; i<15; i++){
            typeDifferentiator = random.nextInt(3);

            if (typeDifferentiator==0){ //Form letter
                letterDifferentiator = random.nextInt(52);
                password = password.concat(letters[letterDifferentiator]);
            } else if (typeDifferentiator==1) { //Form number
                password = password.concat(String.valueOf(random.nextInt(10)));
            } else if (typeDifferentiator==2) { //Form symbol
                symbolDifferentiator = random.nextInt(14);
                password = password.concat(symbols[symbolDifferentiator]);
            }
        }
        return password;
    }
}

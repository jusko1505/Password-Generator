import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;    
import java.io.OutputStream;

public class passRandom
{
    static char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
                            'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    static char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    static char[] symbols = {'!','@','#','$','%','^','&','*'};
    
    Random rand = new Random();
    passGui passGui = new passGui();

    public String lettersOnly(int passLength)
    {
        char[] tempArray= new char[passLength];
        for (int i = 0; i < passLength; i++)
        {
            int randomInt = rand.nextInt(letters.length);
            char placeHolder = letters[randomInt];
            tempArray[i] = placeHolder;
        }
        String temp = new String(tempArray);
        return temp;
    }
    public String numbersOnly(int passLength)
    {
        char[] tempArray= new char[passLength];
        for (int i = 0; i < passLength; i++)
        {
            int randomInt = rand.nextInt(numbers.length);
            char placeHolder = numbers[randomInt];
            tempArray[i] = placeHolder;
        }
        String temp = new String(tempArray);
        return temp;
    }
    public String symbolsOnly(int passLength)
    {
        char[] tempArray= new char[passLength];
        for (int i = 0; i < passLength; i++)
        {
            int randomInt = rand.nextInt(symbols.length);
            char placeHolder = symbols[randomInt];
            tempArray[i] = placeHolder;
        }
        String temp = new String(tempArray);
        return temp;
    }
    public String lettersNumbers(int passLength)
    {
        char[] tempArray= new char[passLength];
        Random rand = new Random();
        for (int i = 0; i < passLength; i++)
        {
            int typePicker = rand.nextInt(2);
            {
                if (typePicker == 0)
                {
                    int randomInt = rand.nextInt(letters.length);
                    char placeHolder = letters[randomInt];
                    tempArray[i] = placeHolder;
                }
                else 
                {
                    int randomInt = rand.nextInt(numbers.length);
                    char placeHolder = numbers[randomInt];
                    tempArray[i] = placeHolder;
                }
            }
        }
        String temp = new String(tempArray);
        return temp;
    }
    public String lettersSymbols(int passLength)
    {
        char[] tempArray= new char[passLength];
        Random rand = new Random();
        for (int i = 0; i < passLength; i++)
        {
            int typePicker = rand.nextInt(2);
            {
                if (typePicker == 0)
                {
                    int randomInt = rand.nextInt(letters.length);
                    char placeHolder = letters[randomInt];
                    tempArray[i] = placeHolder;
                }
                else 
                {
                    int randomInt = rand.nextInt(symbols.length);
                    char placeHolder = symbols[randomInt];
                    tempArray[i] = placeHolder;
                }
            }
        }
        String temp = new String(tempArray);
        return temp;
    }
    public String numbersSymbols(int passLength)
    {
        char[] tempArray= new char[passLength];
        Random rand = new Random();
        for (int i = 0; i < passLength; i++)
        {
            int typePicker = rand.nextInt(2);
            {
                if (typePicker == 0)
                {
                    int randomInt = rand.nextInt(numbers.length);
                    char placeHolder = numbers[randomInt];
                    tempArray[i] = placeHolder;                  
                }
                else 
                {
                    int randomInt = rand.nextInt(symbols.length);
                    char placeHolder = symbols[randomInt];
                    tempArray[i] = placeHolder;
                }
            }
        }
        String temp = new String(tempArray);
        return temp; 
    }
    public String numbersLettersSymbols(int passLength)
    {
        Random rand = new Random();
        char[] tempArray= new char[passLength];
        for (int i = 0; i < passLength; i++)
        {
            int typePicker = rand.nextInt(3); 
            {
                if (typePicker==0)
                {
                    int randomInt = rand.nextInt(letters.length);
                    char placeHolder = letters[randomInt];
                    tempArray[i] = placeHolder;
                }
                else if (typePicker==1)
                {
                    int randomInt = rand.nextInt(numbers.length);
                    char placeHolder = numbers[randomInt];
                    tempArray[i] = placeHolder;
                }
                else
                {
                    int randomInt = rand.nextInt(symbols.length);
                    char placeHolder = symbols[randomInt];
                    tempArray[i] = placeHolder;
                }
            }
        }
        String temp = new String(tempArray);
        return temp;
    }              
}
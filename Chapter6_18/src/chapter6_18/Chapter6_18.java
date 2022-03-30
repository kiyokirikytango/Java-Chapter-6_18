/*
Chapter 6 Programming excercise 18
Riky Hernandez
9/13/21
Description: User enters a password, password must have a characters that consist of
only letters and numbers, and must have at least two number digits
`;-.          ___,
  `.`\_...._/`.-"`
    \        /      ,
    /()   () \    .' `-._
   |)  .    ()\  /   _.'
   \  -'-     ,; '. <
    ;.__     ,;|   > \
   / ,    / ,  |.-'.-'
  (_/    (_/ ,;|.<`
    \    ,     ;-`
     >   \    /
    (_,-'`> .'
          (_,'
 */
package chapter6_18;

import java.util.Scanner;


public class Chapter6_18 {

    public static boolean validPass(String passWord){
            boolean validPass = true;                       //method: to make sure usersinputs password correctly onlu using letters and number, atleast eight and atleast using two numbers
            if (passWord.length()<8){
                validPass= false;
            }
            else{ int numofDig = 0;
                for (int  i = 0; i < passWord.length(); i++){
                    if(isNum(passWord.charAt(i)) || isLet(passWord.charAt(i))){         //making sure user only inputs letters and numbers
                        if (isNum(passWord.charAt(i))){
                            numofDig++;                                     
                       }
                    }
                    else{
                        validPass = false;
                    }
                }
                if (numofDig < 2 ){
                    validPass = false;           ////makein sure user uses more than two numbers
                }
            }
    return validPass;
    
    }  
   
    public static boolean isLet(char ch){
        ch= Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z');           
    }
                                                                //which characters the user can only input letters or numbers
    public static boolean isNum(char ch){
        return (ch >= '0' && ch <= '9' );
    }
    
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);                                    //explaning to the user what they can only input
           System.out.println("Passwords rules: \n"
              + "A password must have at least eight digits\n"
            + "A password must contain only letters and numbers\n"
            + "A password must have at least two digits");
            System.out.println("Enter a password: ");
        String s = input.nextLine();
     
        if (validPass(s)){
        System.out.println("Password: " + s + " is valid");                             // prints if the ueser inputs a password correctly
                }
        else 
            System.out.println("Password: " + s + " is not valid");
    }                                                                           //prints if the user doesnt follow the rules for the password
    
}

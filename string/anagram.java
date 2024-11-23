import java.util.Scanner;

class Anagram{

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Anagram a = new Anagram();

        String string1 = s.nextLine();
        String string2 = s.nextLine();

        if (string1.length() != string2.length()){
            System.out.print("Not Anagram");
        }
        else{
            System.out.print(a.isanagram(string1, string2));
        }



    }

    String isanagram(String s1, String s2){
        int arr1 [] = new int[128];
        int arr2 [] = new int[128];
        int i;
        for (i=0;i<s1.length();i++){
            arr1[s1.charAt(i)] = arr1[s1.charAt(i)]+1;
            arr2[s2.charAt(i)] = arr2[s2.charAt(i)]+1;
        }
        for (i=0;i<s1.length();i++){
            if (arr1[s1.charAt(i)] != arr2[s1.charAt(i)]){
                return "Not Anagram";
            }

        }
        return "Anagram";
    }
}
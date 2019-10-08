import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Construct a String with diagonal elements
 *  divide that String into possible substrings of given size k
 *  Print all substrings in lexicographical order
 */
public class MakeSubString {

    public static void main(String[] args) {
      char [][] ch= {{'b', 'c', 'd'}, {'p', 'a', 'n'}, {'a', 'x', 'm'}};
      subString(ch,2);
    }
 private static void subString(char[][] ch,int k){
    if(k>ch.length){
        throw new IllegalArgumentException("K value should not be greater than String length");
    }
       String diagonalString="";
       List<String> digonalSubString= new ArrayList();
        for(int i=0;i<ch.length;i++){
            diagonalString+=ch[i][i];
        }
        for(int i=0;i<diagonalString.length()-(k-1);i++){
            digonalSubString.add(diagonalString.substring(i,i+k));
        }
        Collections.sort(digonalSubString);
        for (String s: digonalSubString
             ) {
            System.out.println(s);
        }

    }
}

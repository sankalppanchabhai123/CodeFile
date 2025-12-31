package String;

public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        // for(int j=i;j>=0;j--){
        //     if(s.charAt(j)==' '){
        //             break;
        //     }
        //     count++;
        //     }
        
        return count;
    }
    
}
package Strings.Easy;

import java.util.List;

class makeStringEqual{

    static boolean makeStringequal(String str1,String str2){

        List<>

        char ch[] = str1.toCharArray();
        int left =0;
        while(left<str1.length()){
                if(ch[left]!=str2.charAt(left)){
                    for(int i=left;i<str1.length();i=i+2){
                        if(ch[i]==str2.charAt(left)){
                            char temp = ch[left];
                            ch[left] = ch[i];
                            ch[i] = temp;
                            break;
                        }
                        else{
                            continue;
                        }
                    }
                }

                left++;
        }

        System.out.println(ch);

        if(str2.equals(new String(ch))){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        String str1 = "defg";
        String str2 = "gefdu";

        System.out.println(makeStringequal(str1, str2));
    }
}
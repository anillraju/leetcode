package leetcode.hashtable.easy;

public class AlienDictionary953 {

        public boolean isAlienSorted(String[] words, String order) {
            int[] index = new int[26];
            for(int i=0; i < order.length(); i++){
                index[order.charAt(i) - 'a'] = i;
            }

            if(words.length == 0 || words.length==1)
                return true;


            for(int i=0; i < words.length - 1; i++){
                boolean returnVal = isAlienSorted(words[i], words[i+1], index);
                if(returnVal){
                    continue;
                } else {
                    return false;
                }
            }

            return true;

        }


        boolean isAlienSorted(String a, String b, int[] orderMap){

            int lenA = a.length();
            int lenB = b.length();

            for(int i = 0; i < Math.min(lenA, lenB); i++){
                int fromA = orderMap[a.charAt(i) - 'a'];
                int fromB = orderMap[b.charAt(i) - 'a'];
                if(fromA == fromB){
                    continue;
                } else if(fromA < fromB){
                    return true;
                }else {
                    return false;
                }

            }
            if(lenA > lenB){
                return false;
            }
            return true;
        }

}

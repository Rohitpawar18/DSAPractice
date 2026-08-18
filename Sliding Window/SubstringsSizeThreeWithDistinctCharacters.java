public class SubstringsSizeThreeWithDistinctCharacters{
  public static void main(String ar[]){
    String s = "aababcabc";
    
    System.out.println(countGoodSubstrings(s));
  }

  public static int countGoodSubstrings(String s){
    
    int i = 0;
    int count = 0;
    int[] arr = new int[26];

    for(int j = 0; j < s.length(); j++){
      arr[s.charAt(j) - 'a']++;
      int renge = j - i + 1;

      if(renge == 3){
        if(isGoodString(arr)){
          count++;
        }

        arr[s.charAt(i++) - 'a']--;
      }
    }
    return count;
  }

  public static boolean isGoodString(int[] arr){
    for(int i = 0; i < 26; i++){
      if(arr[i] > 1){
        return false;
      }
    }

    return true;
  }

}
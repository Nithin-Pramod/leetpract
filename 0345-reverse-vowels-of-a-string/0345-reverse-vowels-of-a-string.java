class Solution {
    
    void swap(List<Character> arr, int a ,  int b ){
        
        char temp = arr.get(a);
        arr.set(a,arr.get(b));
        arr.set(b,temp);
        
    }
    
    boolean checkVowel(char a){   
        a = Character.toLowerCase(a);
        
        switch (a) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            return true;
        default:
            return false;
        }    
    }
    
    
    public String reverseVowels(String s) {
        
        char[] arr = s.toCharArray();
        List<Character> vowelArray = new ArrayList();
        for(char i : arr){
            if(checkVowel(i)){
                vowelArray.add(i);
            }
        }
        
        for(int i = 0 ; i < vowelArray.size()/2 ; i++ ){
            swap(vowelArray,i,vowelArray.size()-i-1);
        }
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(checkVowel(arr[i])){
                arr[i]=vowelArray.get(count);
                count++;
            }
        }
        
        return new String(arr);
        
        
    }
}
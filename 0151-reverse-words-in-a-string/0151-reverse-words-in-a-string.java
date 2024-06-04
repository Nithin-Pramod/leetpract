class Solution {
    public String reverseWords(String s) {
        
        String[] splittedString =  s.split("\\s+");
        String tempString = "";
        int length = splittedString.length;
        if(length==1) return splittedString[0];
        for(int i = 0 ; i < splittedString.length ; i++){
            if(i==0){
                tempString+=splittedString[length-1];
            }
            if(i>0 && i < length-1){
                tempString = tempString + " " + splittedString[length-i-1]; 
            }
            if(i==length-1 && splittedString[length-i-1]!=""){
                tempString = tempString + " " + splittedString[length-i-1]; 
            }
            
        }
        
        return tempString;
        
        
    }
}
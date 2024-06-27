class Solution {
    public String predictPartyVictory(String senate) {
        
        char[] senateArr = senate.toCharArray();
        
        int length = senateArr.length;
        
        
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();
        
        for(int i =0 ; i < length ; i ++){
            if(senateArr[i]=='R') rQueue.add(i);
            else  dQueue.add(i);
        }
        
        while(dQueue.size()!=0 && rQueue.size()!=0 ){
            int dTurn = dQueue.poll();
            int rTurn = rQueue.poll();
            
            if(rTurn < dTurn) rQueue.add(rTurn+length);
            else dQueue.add(dTurn+length);
        }
        
        return rQueue.size()>dQueue.size() ? "Radiant":"Dire";
        
        
    }
}
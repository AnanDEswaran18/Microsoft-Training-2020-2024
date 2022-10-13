class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet visit=new HashSet();
        HashSet repeated=new HashSet();
        for(int i=0;i+9<s.length();i++){
            String str=s.substring(i,i+10);
            if(!visit.add(str)){
                repeated.add(str);
            }
        }
        return new ArrayList(repeated);
    }
}

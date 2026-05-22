class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int i=0;
        int j=n-1;
        int boat=0;
        Arrays.sort(people);
        while(i<=j){
            int weight=people[i]+people[j];
            if(weight<=limit){
                boat++;
                i++;
                j--;
            }
            else if(weight>limit){
                if(people[i]>people[j]) {
                    boat++;
                    i++;
                }
                else{ 
                    boat++;
                    j--;
                }
            }
            
        }
        return boat;
    }
}
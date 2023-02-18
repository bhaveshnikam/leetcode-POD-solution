//kids-with-the-greatest-number-of-candies
class Solution {
     public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> z = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        int r=max;
        // System.out.println(max);
        for (int i = 0; i < candies.length; i++) {
            int a = candies[i] + extraCandies;
            if (a >= r) {
                z.add(i, true);
            } else{
                z.add(i, false);
            }
            a=0;
            // else
            // {
            //     z.add(i,true);
            // }
            // a=0;

        }
        
        return z;
    }

}

class Solution {
    public double angleClock(int hour, int minutes) {
        double res =  Math.abs(((30 * hour) - (5.5 * minutes)));
        return res > 180 ? 360 - res : res;
    }
}
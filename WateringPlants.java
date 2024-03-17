public class WateringPlants {
    public static int wateringPlants(int[] plants, int capacity) {
        int steps = 0, remain = capacity;
        for( int i=0;i<plants.length;i++){
            if( remain>=plants[i] ){
                steps += 1;
            }
            else{
                remain = capacity;
                steps += 2*(i+1)-1;
            }
            remain -=  plants[i];
        }
        return steps;
    }
    public static void main(String[] args) {
        int[] plants = {7,7,7,7,7,7,7};
        int capacity = 8;
        System.out.println(wateringPlants(plants, capacity));
    }
}

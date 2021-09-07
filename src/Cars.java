public class Cars {
    public static void main(String[] args) {
        boolean redIsHitFromBehind=false;
        boolean blackIsHitFromBehind=true;
        if(redIsHitFromBehind && blackIsHitFromBehind || !redIsHitFromBehind && !blackIsHitFromBehind)
            System.out.println("Invalid state");
        else if(redIsHitFromBehind)
            System.out.println("Black");
        else
            System.out.println("Red");
    }
}

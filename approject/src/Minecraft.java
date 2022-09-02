public class Minecraft {
    /**
     * primary hp is 100 and with every q it will be decreased by 10 and with every p it will be increased by 10.
     * @param q
     * @param p
     * @return
     */
    public static double Minecraft(double q,double p){
        double hp=100;
        double t = p-q;
        if(t>0) {
            for (double i = 0; i < t; i++) {
                hp += 10;
                if (hp >= 100){
                    hp=100;
                    break;
                }
            }
        }
        else{
            for(double j =0;j<(-t);j++){
                hp-=10;
                if(hp<=0) {
                    hp=0;
                    break;
                }
            }
        }
        return hp;
    }
}

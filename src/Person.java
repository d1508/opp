public class Person {

    //data
    String name ="none";
    int id=00000000;
    double height=1.50 ;
    boolean isMarried =false;

    // Fonction

    void sleep(){
        System.out.println("Wake me up in 8 hours");
    }


    @Override // CLICK DROIT GENERATE TOSTRING CA FAIS CA AUTOMATIQUE
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", height=" + height +
                ", isMarried=" + isMarried +
                '}';
    }
}

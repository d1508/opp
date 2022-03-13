public class Triangle {
    //data
    int a ;
    int b ;
    int c ;
    int h ;


    // CONSTRUCTOR POUR DEFINIR QU UNE SEUL FOIS

    Triangle(int a , int b , int c , int h){
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }

    // FONCTION
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", h=" + h +
                '}';
    }
}

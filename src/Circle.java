public class Circle {
    double radius;
    double hekef;
    double area;


    double calcArea (double r ){
        return r*r*3.14;
    }

    double calcHekef(double r){
        return 2*r*3.14;
    }

    //@Override
    //public String toString() {
    //    return "Circle{" +
    //            "radius=" + radius +
    //            ", hekef=" + hekef +
    //            ", area=" + area +
    //            '}';
    //}

    @Override // C POUR IMPRIMER TOUT CE QUE CONTIEN LE FICHIER CIRCLE
    public String toString(){
        return " the radius of this circle is  :"+this.radius;


    }
}

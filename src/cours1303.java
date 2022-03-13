import java.util.Scanner;

public class cours1303 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);


        //CORRECTION EXERCICE

        // מחלקה היא קובץ של קוד שמתאר ומכיל פורמט של עצמים. <1
        //3 object , מופע  עצם או משתנה
        //4> ClassName objectName = new ClassName();
        //5>
        //Person p1 = new Person();
        //Person p2 = new Person();
////
        //p1.name = "lior ";
        //p1.id = 3232323;
        //p1.height = 1.67;
        //p1.isMarried = false;
        //System.out.println(p1.name);
        //System.out.println(p1.id);
        //System.out.println(p1.height);
        //System.out.println(p1.isMarried);
////
        //p2.name = "david";
        //p2.id = 443286576;
        //p2.height = 1.84;
        //p2.isMarried = true;
        //System.out.println(p2.name);
        //System.out.println(p2.id);
        //System.out.println(p2.height);
        //System.out.println(p2.isMarried);
        //p1.sleep();
        //p2.sleep();
//
        //Cup es = new Cup();
        //es.size = 'S';
        //es.typeOfDrink = "dark coffee;";
        //System.out.println(es.size);
        //System.out.println(es.typeOfDrink);
        //es.drink();
        //System.out.println(p1);

        // CALCULE DE L AIR D UN CERCLE
        //Circle c = new Circle();
        //c.radius=55;
        //System.out.println("entre le perimetre");
        //int air = scan1.nextInt();
//
        //double area = c.calcArea(air);
        //System.out.println(area);
//
        //System.out.println(c); // IMPRIME JE SUIS LE MEILLEUR @ OVERRIDE ////


        // TRIANGLE

        //Triangle t = new Triangle(1, 2, 3, 4);
        //Triangle t2 = new Triangle(4, 343, 34, 87);
//t.a=1;//
//t.b=3;//
//t.c=2;//
//t.h=5;//
        //System.out.println(t);
        //System.out.println(t2);

        Course c = new Course("Devops", 4, "MONEYYYY");
        System.out.println(c);
        c.breakee();

    }

}

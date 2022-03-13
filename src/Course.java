public class Course {

    //DATA
    String name ;
    int numberOfStudents;
    String subject;


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", subject='" + subject + '\'' +
                '}';
    }

    // CONSTRUCTOR
    Course(String name , int numberOfStudents,String subject ) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.subject = subject;
    }
        // FONCTION

         void  breakee(){
            System.out.println("break in 45 min ");
        }



    }


package schedulemaker;

public class Course {
    
    String courseName = new String(); 
    public void setCourseName(String name) { this.courseName = name; }
    public String getCourseName() { return this.courseName; }
    
    String instructor = new String();
    public void setInstructor( String name) { this.instructor = name; }
    public String getInstructor() { return this.instructor; }
    
    int courseID;
    public void setCourseID(int id) { this.courseID = id; }
    public int getCourseID() { return this.courseID; }

    public Course(String name, int id) {
        this.courseName = name;
        this.courseID = id;
    }
}



// The following is a suggestion (can be omitted).

class Lecture extends Course {
    int cells;
    String hall;

    public Lecture(String name, int id, int cells, String hall) {
        super(name, id);
        cells = 3;
        this.hall = hall;
    }
}

class Tutorial extends Course {
    int cells;
    String lab;

    public Tutorial(String name, int id, int cells, String lab) {
        super(name, id);
        cells = 2;
        this.lab = lab;
    }
}


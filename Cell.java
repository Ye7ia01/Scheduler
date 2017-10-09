package schedulemaker;

public class Cell { // Every Object of Cell will Contain The Following Variables
    
    private final String Day;
    private int hall_num;
    private String course_name;
    private String course_code;
    private final int cell_num;
    private boolean reserved; // Variable to check if this Cell is reserved before
    private String Inst; // Optional , if we want to put the instructor name
    private String time_range;  // A String time range JUST FOR OUTPUT
 
    
    public Cell(int cell_num ) { // must be initialized by a number & a Day as there are 6 Days
        this.cell_num = cell_num;
        this.reserved = false;
        Day = this.give_day(cell_num); //private function that automatically generate the day based on the number of cell
        time_range = this.give_time_range(cell_num); //private function that automaticly gives the time range so no one will deal with time 
    }
    
    public int get_cell_num() {
        return this.cell_num;
    }
    public int get_hall_num() {
        return this.hall_num;
    }
    
    public void set_course_name(String n) {
        this.course_name = n;
    }
   
    public String get_course_name() {
        return this.course_name;
    }
    public void set_course_code(String c) {
        this.course_code = c;
    }
    public String get_course_code() {
        return this.course_code;
    }
    public void set_instructor(String name) {
        this.Inst = name;
    }
    public String get_instructor() {
        return this.Inst;
    }
    public String get_time_range() {
        return this.time_range;
    }
    public String get_day() {
        return this.Day;
    }

    public boolean reserve(Hall h) { // We Dont Need To Make ( is_reserved() ) as reserve() act as both of them as it return boolean
        if (this.reserved || !h.is_avaliabe(this.time_range)) { 
            return false; }
        this.hall_num = h.get_number();
        this.reserved = true;
        h.set_time_range(this.time_range);
        return true;
    }
    public boolean reserve_all(String c_name,String code,String Inst,Hall h ) { // a function to ease reserving , takes all needed argument in one time
        if (reserve(h)) {
        this.course_name = c_name;
        this.course_code = code;
        this.Inst = Inst;
        return true; }
        return false; 
    }
    public void clear_cell() { // We might need to clear a cell // 
        this.reserved = false;
        this.course_name = "";
        this.course_code = "";
        this.Inst = "";
    }
    
       private String give_time_range(int cell_num) { // FUNCTION is PRIVATE because we just need it in the class
        if (cell_num==1 || cell_num==13 || cell_num==25 || cell_num==37 || cell_num==49 || cell_num==61) {
            return "8:15-9:05";
        }
        if (cell_num==2 || cell_num==14 || cell_num==26 || cell_num==38 || cell_num==50 || cell_num==62) {
            return "9:10-10:00";
        }
        if (cell_num==3 || cell_num==15 || cell_num==27 || cell_num==39 || cell_num==51 || cell_num==63) {
            return "10:05-10:55";
        }
        if (cell_num==4 || cell_num==16 || cell_num==28 || cell_num==40 || cell_num==52 || cell_num==64) {
            return "11:00-11:50";
        }
        if (cell_num==5 || cell_num==17 || cell_num==29 || cell_num==41 || cell_num==53 || cell_num==65) {
            return "12:20-1:10";
        }
        if (cell_num==6 || cell_num==18 || cell_num==30 || cell_num==42 || cell_num==54 || cell_num==66) {
            return "1:15-2:05";
        }
        if (cell_num==7 || cell_num==19 || cell_num==31 || cell_num==43 || cell_num==55 || cell_num==67) {
            return "2:10-3:00";
        }
        if (cell_num==8 || cell_num==20 || cell_num==32 || cell_num==44 || cell_num==56 || cell_num==68) {
            return "3:05-3:55";
        }
        if (cell_num==9 || cell_num==21 || cell_num==33 || cell_num==45 || cell_num==57 || cell_num==69) {
            return "4:20-5:10";
        }
        if (cell_num==10 || cell_num==22 || cell_num==34 || cell_num==46 || cell_num==58 || cell_num==70) {
            return "5:15-6:05";
        }
        if (cell_num==11 || cell_num==23 || cell_num==35 || cell_num==47 || cell_num==59 || cell_num==71) {
            return "6:10-7:00";
        }
        if (cell_num==12 || cell_num==24 || cell_num==36 || cell_num==48 || cell_num==60 || cell_num==72) {
            return "7:05-7:55";
        }
        
        else return "";
    }
       private String give_day(int cell_num) {
           if(cell_num >= 1 && cell_num <= 12) {
               return "saturday";
           }
           if (cell_num >=13 && cell_num <= 24) {
               return "sunday";
           }
           if (cell_num >= 25 && cell_num <= 36) {
               return "monday";
           }
           if (cell_num >= 37 && cell_num <= 48) {
               return "tuesday";
           }
           if (cell_num >= 49 && cell_num <= 60) {
               return "wednesday";
           }
           if (cell_num >=61 && cell_num <= 72) {
               return "thursday";
           }
           return "";
       }
    
    
}


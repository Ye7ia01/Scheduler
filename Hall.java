package schedulemaker;

public class Hall { 
      
       private int number;
       private String[] time_ranges; // a must so that the same cell num in different Schedule cannot take the same HALL 
       
       public Hall(int num) {
           this.number = num;
           time_ranges = new String[12];
           init();
       }
       private void init() { // initialization for time_ranges array
           for (int i=0;i<12;i++) {
               time_ranges[i] = "";
           }
       }
      
       public int get_number() { 
           return this.number; 
            }
            
                    
       public void set_number(int num) {
           this.number = num;
       }
       
       public void set_time_range(String time) { // a function CLASS CELL use after RESERVE so that the next RESERVE know if hall is_avaliable()
           for (int a=0;a<12;a++) {
               if (time_ranges[a] == "") {
                   time_ranges[a] = time;
                   break;
               }
           }   
       }  
       public boolean is_avaliabe(String time_range) { // a function that CLASS CELL use in RESERVE process
           for (int j=0;j<12;j++) {
               if (time_range.equals(time_ranges[j])) {
                   return false;
               }   
           }
           return true;
       }

}



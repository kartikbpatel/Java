import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
    private int token;
    private String fname;
    private double cgpa;
    public Student(){}
    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getToken() {
        return token;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
     if(Double.compare(s2.getCgpa(),s1.getCgpa()) == 0){
        if(s1.getFname().equals(s2.getFname())){
          return s1.getToken() - s2.getToken();
      }
      else{
       return (s1.getFname()).compareTo(s2.getFname());
   }
}
else
  return Double.compare(s2.getCgpa(),s1.getCgpa());
}
}

public class PriorityQueueJava
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        
        Queue<Student> priorQueue = new PriorityQueue<Student>(10, new StudentComparator());
        
        while(totalEvents>0) {
            String event = in.next();
            if(event.equals("ENTER")) { // read Name, cgpa and token

                String fname = in.next();
                double cgpa = in.nextDouble();
                int id = in.nextInt();
                Student stud = new Student(id, fname, cgpa);
                
                priorQueue.add(stud);
            } 
            else if (event.equals("SERVED") ) {
                if(priorQueue.size() > 0) {
                    priorQueue.poll();
                }
            }
            totalEvents--;
        }
        
        if(priorQueue.size() == 0) 
            System.out.println("EMPTY");
        else {
            while(priorQueue.size() > 0) {
             Student stud = priorQueue.poll();
             System.out.println(stud.getFname());
         }
     }
 }
}
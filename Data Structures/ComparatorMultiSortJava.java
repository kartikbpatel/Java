import java.util.*;

class Student{
 private int id;
 private String fname;
 private double cgpa;
 public Student(int id, String fname, double cgpa) {
  super();
  this.id = id;
  this.fname = fname;
  this.cgpa = cgpa;
}
public int getId() {
  return id;
}
public String getFname() {
  return fname;
}
public double getCgpa() {
  return cgpa;
}
}

class Checker implements Comparator<Student>{

	// Overriding the compare method to sort the age 
 @Override
 public int compare(Student s1, Student s2) {
   if(Double.compare(s2.getCgpa(),s1.getCgpa()) == 0){
    if(s1.getFname().equals(s2.getFname())){
      return s1.getId() - s2.getId();
    }
    else{
     return (s1.getFname()).compareTo(s2.getFname());
   }
 }
 else
  return Double.compare(s2.getCgpa(),s1.getCgpa());
}
}

//Complete the code
public class ComparatorMultiSortJava
{
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  int testCases = Integer.parseInt(in.nextLine());

  List<Student> studentList = new ArrayList<Student>();
  while(testCases>0){
   int id = in.nextInt();
   String fname = in.next();
   double cgpa = in.nextDouble();

   Student st = new Student(id, fname, cgpa);
   studentList.add(st);

   testCases--;
 }
 Checker checker = new Checker();
 Collections.sort(studentList, checker);

 for(Student st: studentList){
   System.out.println(st.getFname());
 }
}
}

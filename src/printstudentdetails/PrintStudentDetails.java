

package printstudentdetails;


/**Array of objects - java example: print student details
 * Project - share to github : collaboration tool, tracking changes keep history - version control software
 * char[] reverse = new char[word.length()]; - reverse of word 
 * print 3 students details are name, age store in array then print array of objects
 * @author Gabriela Moniz
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //used for user interaction printing, input
        
        Student [] list = new Student[3]; //array of objects declaration
        //create students 3 - object 
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setAge(20);
        list[0] = s1;
        System.out.println(list[0].getName() + list[0].getAge());
    }

}

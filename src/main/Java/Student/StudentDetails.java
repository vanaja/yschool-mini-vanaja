package Student;

/**
 *
 * @author Vanaja
 */
public class StudentDetails {
   public String studentName;
   String grade;
   String subject;
   int marks;

    /**
     * @return the StudentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param StudentName the StudentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the Grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param Grade the Grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the Subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param Subject the Subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the Marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * @param Marks the Marks to set
     */
    public void setMarks(int marks) {
        this.marks = marks;
    }
   
}
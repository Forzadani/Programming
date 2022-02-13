package Task_4.Person;
import Task_4.*;
import Task_4.Person.Person;

/**
 *
 * @author dani
 */
public class Teacher extends Person{
    Course teaches;
    
    /**
     * This is a constructor by default.
     */
    public Teacher(){
        teaches = new Course();
        this.setName("");
        this.setSurname("");
        this.setEmail("");
    }
    
    /**
     * This is a copy constructor.
     * @param copy is the Teacher object.
     */
    public Teacher(Teacher copy){
        this.setName(copy.getName());
        this.setSurname(copy.getSurname());
        this.setEmail(copy.getEmail());
    }
    
    /**
     * This is a constructor by parameters.
     * @param name is the Teacher name.
     * @param surname is the Teacher surname.
     * @param email is the Teacher email.
     * @param teaches is the Teacher course.
     */
    public Teacher(String name, String surname, String email, Course teaches){
        this.teaches = new Course(teaches);
        this.setName(name);
        this.setSurname(surname);
        this.setEmail(email);
    }
    
    /**
     * This method return all the values.
     * @return a String.
     */
    public String toString(){
        return "Name: "+this.getName()+" | Surname: "+this.getSurname()+" | Email: "+this.getEmail()+" | Course: "+teaches.getName()+" | Course ID: "+teaches.getId();
    }
    
    /**
     * This method clone the object Teacher.
     * @return a Teacher object.
     */
    public Teacher clone(){
        Teacher other = new Teacher(this);
        return other;
    }
    
    /**
     * This method compare two objects.
     * @param other is the name of the Teacher object.
     * @return a Boolean.
     */
    public boolean equals(Teacher other){
        if(this.getName().equals(other.getName()) && this.getSurname().equals(other.getSurname()) && this.getEmail().equals(other.getEmail()) && this.teaches.equals(other)){
            return true;
        }
        return false;
    }
}

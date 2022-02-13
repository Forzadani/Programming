package Task_4;

/**
 *
 * @author dani
 */
public class BusinessCourse extends Course{
    protected int internship;
    
    /**
     * This is the constructor by default.
     */
    public BusinessCourse(){
        this.setName("");
        this.setTeacher("");
        this.setId("");
        this.setDuration(30);
        this.internship = 15;
    }
    
    /**
     * This is the constructor with parameters.
     * @param name is the name of the Business Course.
     * @param teacher is the name of the teacher.
     * @param id is the identification of the course.
     * @param duration is the duration of the course.
     */
    public BusinessCourse(String name, String teacher, String id){
        this.setName(name);
        this.setTeacher(teacher);
        this.setId(id);
        this.setDuration(30);
        this.internship = 15;
    }
    
    /**
     * This is a copy constructor.
     * @param copy is the object name.
     */
    public BusinessCourse(BusinessCourse copy){
        copy.name = this.name;
        copy.teacher = this.teacher;
        copy.id = this.id;
        copy.duration = this.duration;
    }
    
    /**
     * This method return all the values.
     * @return a String.
     */
    public String toString(){
        return "Name: "+getName()+" | Teacher: "+getTeacher()+" | ID: "+getId()+" | Duration: "+getDuration()+" with an internship that lasts for at least 15 hours.";
    }
    
    /**
     * This method clone the object Course.
     * @return an Course object.
     */
    public Course clone(){
        Course otro = new Course();
        otro.setName(this.name);
        otro.setTeacher(this.teacher);
        otro.setId(id);
        otro.setDuration(duration);
        return otro;
    }
    
    /**
     * This method compare two objects.
     * @param otro is the name of the course object.
     * @return a Boolean.
     */
    public boolean equals(Course otro){
        if(otro == this){
            return true;
        }
        return false;
    }
}

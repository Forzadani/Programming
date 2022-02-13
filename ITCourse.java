
package Task_4;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dani
 */
public class ITCourse extends Course{
    private String specialization;
    
    /**
     * This is a constructor by default.
     */
    public ITCourse(){
        name = "";
        id = "";
        teacher = "";
        duration = 0;
        specialization = "";
    }
    
    /**
     * This is a copy constructor.
     * @param copy is the ITCourse's object.
     */
    public ITCourse(ITCourse copy){
        this.name = copy.name;
        this.id = copy.id;
        this.teacher = copy.teacher;
        this.duration = copy.duration;
        this.specialization = copy.specialization;
    }
    
    /**
     * This is a constructor by parameters.
     * @param name is the name of ITCourse.
     * @param id is the id of ITCourse.
     * @param teacher is the name of teacher.
     * @param specialization is the specialization of ITCourse.
     */
    public ITCourse(String name, String id, String teacher, String specialization){
        this.setName(name);
        this.setId(id);
        this.setTeacher(teacher);
        if(specialization.equals("networking")){
            this.setDuration(35);
        }
        if(specialization.equals("programming")){
            this.setDuration(50);
        }
        if(specialization.equals("sysadmin")){
            this.setDuration(40);
        }
    }
    
    /**
     * This method return all the values.
     * @return a String.
     */
    public String toString(){
        return "Name: "+getName()+" | Teacher: "+getTeacher()+" | ID: "+getId()+" | Duration: "+getDuration()+" | Specialization: "+this.specialization;
    }
    
    /**
     * This method clone the object ITCourse.
     * @return an ITCourse object.
     */
    public ITCourse clone(){
        ITCourse other = new ITCourse();
        other.name = this.name;
        other.teacher = this.teacher;
        other.id = this.id;
        other.duration = this.duration;
        other.specialization = this.specialization;
        return other;
    }
    
    /**
     * This method compare two objects.
     * @param other is the name of the itcourse object.
     * @return a Boolean.
     */
    public boolean equals(ITCourse other){
        if(other == this){
            return true;
        }
        return false;
    }
}

package Task_4;

/**
 *
 * @author dani
 */
public class Course {
    protected String name, id, teacher;
    protected int duration;
        
    /**
     * This method set the name of course.
     * @param name is the name of the Course.
     */
    public void setName(String name){
        if(name.length()>=4){
            this.name = name;
        }
    }
    
    /**
     * This method set the name of the teacher.
     * @param teacher is the name of the Teacher.
     */
    public void setTeacher(String teacher){
        if(teacher.contentEquals(",")){
            this.teacher = teacher;
        }
    }
    
    /**
     * This method set the ID of the course.
     * @param id  is the ID of the Course.
     */
    public void setId(String id){
        if(id.startsWith(name.substring(0, 1)) && id.endsWith(teacher.substring(0, 1))){
            this.id = id;
        }
    }
    
    /**
     * This method set the duration of the course.
     * @param duration is the duration of the Course.
     */
    public void setDuration(int duration){
        if(duration >= 30){
            this.duration = duration;
        }
    }
    
    /**
     * This method return the value of the name of course.
     * @return a String.
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * This method return the teacher's name.
     * @return a String.
     */
    public String getTeacher(){
        return this.teacher;
    }
    
    /**
     * This method return the course's ID.
     * @return a String.
     */
    public String getId(){
        return this.id;
    }
    
    /**
     * This method return the course's duration.
     * @return an Integer.
     */
    public int getDuration(){
        return this.duration;
    }
  
    /**
     * This method return all the values.
     * @return a String.
     */
    public String toString(){
        return "Name: "+getName()+" | Teacher: "+getTeacher()+" | ID: "+getId()+" | Duration: "+getDuration();
    }
    
    /**
     * This method clone the object Course.
     * @return an Course object.
     */
    public Course clone(){
        Course otro = new Course();
        otro.name = this.name;
        otro.teacher = this.teacher;
        otro.id = this.id;
        otro.duration = this.duration;
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

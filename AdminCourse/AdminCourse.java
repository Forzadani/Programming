package Task_4;

/**
 *
 * @author dani
 */
public class AdminCourse extends Course{
    private String [] documents;
    private int tam;
    
    /**
     * This is a constructor by default.
     */
    public AdminCourse(){
        name = "";
        id = "";
        teacher = "";
        duration = 40;
        documents = new String[0];
    }
    
    /**
     * This is a copy constructor.
     * @param copy is the AdminCourse's object.
     */
    public AdminCourse(AdminCourse copy){
        this.name = copy.name;
        this.id = copy.id;
        this.teacher = copy.teacher;
        this.duration = copy.duration;
        this.documents = copy.documents;
    }
    
    /**
     * This is a constructor by parameters.
     * @param name is the name of AdminCourse.
     * @param id is the id of AdminCourse.
     * @param teacher is the name of teacher.
     * @param specialization is the specialization of AdminCourse.
     */
    public AdminCourse(String name, String id, String teacher, String [] documents, int tam){
        this.setName(name);
        this.setId(id);
        this.setTeacher(teacher);
        this.setDuration(40);
        this.tam = tam;
        this.documents = new String[tam];
    }
    
    /**
     * This method return all the values.
     * @return a String.
     */
    public String toString(){
        String documents_name="";
        for(int i=0; i<tam; i++){
            if(i == tam-1){
                documents_name += documents[i];
            }else{
                documents_name += documents[i] + ", ";
            }
        }
        return "Name: "+getName()+" | Teacher: "+getTeacher()+" | ID: "+getId()+" | Duration: "+getDuration()+" | Documents: "+documents_name+".";
    }
    
    /**
     * This method clone the object ITCourse.
     * @return an AdminCourse object.
     */
    public AdminCourse clone(){
        AdminCourse other = new AdminCourse();
        other.name = this.name;
        other.teacher = this.teacher;
        other.id = this.id;
        other.duration = this.duration;
        other.documents = this.documents;
        return other;
    }
    
    /**
     * This method compare two objects.
     * @param other is the name of the AdminCourse object.
     * @return a Boolean.
     */
    public boolean equals(AdminCourse other){
        if(other == this){
            return true;
        }
        return false;
    }
}

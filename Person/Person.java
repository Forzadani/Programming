package Task_4.Person;

/**
 *
 * @author dani
 */
public class Person {
    private String name, surname, email;
    
    /**
     * This is a constructor by default.
     */
    public Person(){
        name = "";
        surname = "";
        email = "";
    }
    
    /**
     * This is a constructor by parameters.
     * @param name is the Person name.
     * @param surname is the Person surname.
     * @param email is the Person email.
     */
    public Person(String name, String surname, String email){
        this.setName(name);
        this.setSurname(surname);
        this.setEmail(email);
    }
    
    /**
     * This is a copy constructor.
     * @param copy is the Person object.
     */
    public Person(Person copy){
        this.name = copy.name;
        this.surname = copy.surname;
        this.email = copy.email;
    }
    
    /**
     * This method set the name of Person.
     * @param name is the name of the Person.
     */
    public void setName(String name){
        if(name.length()>=3){
            this.name = name;
        }
    }
    
    /**
     * This method set the surname of Person.
     * @param surname is the surname of the Person.
     */
    public void setSurname(String surname){
        surname = surname.toUpperCase();
        if(!surname.contentEquals(" ")){
            
        }
    }
    
    /**
     * This method set the email of Person.
     * @param surname is the email of the Person.
     */
    public void setEmail(String email){
        if(email.contentEquals("@") && (email.endsWith(".es") || email.endsWith(".com"))){
            this.email = email;
        }
    }
    
    /**
     * This method return the value of the name.
     * @return a String.
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * This method return the value of the surname.
     * @return a String.
     */
    public String getSurname(){
        return this.surname;
    }
    
    /**
     * This method return the value of the email.
     * @return a String.
     */
    public String getEmail(){
        return this.email;
    }
    
    /**
     * This method return all the values.
     * @return a String.
     */
    public String toString(){
        return "Name: "+this.getName()+" | Surname: "+this.getSurname()+" | Email: "+this.getEmail();
    }
    
    /**
     * This method clone the object Person.
     * @return a Person object.
     */
    public Person clone(){
        Person other = new Person(this);
        return other;
    }
    
    /**
     * This method compare two objects.
     * @param other is the name of the Person object.
     * @return a Boolean.
     */
    public boolean equals(Person other){
        if(this.getName().equals(other.getName()) && this.getSurname().equals(other.getSurname()) && this.getEmail().equals(other.getEmail())){
            return true;
        }
        return false;
    }
}

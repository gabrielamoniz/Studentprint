

package printstudentdetails;

/**model class
 *define an entity Student attributes name, id, age, functions / methods etc
 * encapsulation principle - object oriented design principals
 * local rep in laptop: 1 - initialize version 2 - .gitconfig 3 - .gitignore
 * netbeans code - working tree code - to local rep - commit;
 * @author Gabriela Moniz
 */
public class Student {
    private String name;
    private int age;
    private int sid;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}


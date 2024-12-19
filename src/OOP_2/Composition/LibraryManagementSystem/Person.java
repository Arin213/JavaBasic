package OOP_2.Composition.LibraryManagementSystem;
/****Requirements:**
 1. **Inheritance:**
 - Create a `Person` class with basic details (like `name` and `age`).
 - Extend it to create two specific classes:
 - `Author`
 - `Reader`
 * */
public class Person {
    private String name;
    private String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
// 2. **Author (Subclass of Person)**
// Additional Attributes: `biography`.
class Author extends Person{
    private String biography;

    public Author(String name, String age, String biography) {
        super(name, age);
        this.biography = biography;
    }
    public String getBiography(){
        return biography;
    }
}
class Reader extends Person{
    private String prefferedGenre;

    public Reader(String name, String age, String preferredGenre) {
        super(name, age);
        this.prefferedGenre = preferredGenre;
    }

    public String getPrefferedGenre(){
        return prefferedGenre;
    }
}
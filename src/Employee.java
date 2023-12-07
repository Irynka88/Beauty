import java.util.Random;
public class Employee {
    String name;
    String profession;
    String experience;



    public Employee(String name, String profession, String experience) {
        this.name = name;
        this.profession = profession;
        this.experience = experience;
    }

    public Employee () {
    }

    Random random = new Random();
    //Знайомство з працівником
    void employee(){
        System.out.println("Привіт!");
    }

    final void note(){
        System.out.println("Вільний місяць на запис : " + random.nextInt(12)*1 + ".2024"   );
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getExperience() {
        return experience;
    }
}

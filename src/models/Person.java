package models;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nPersona [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Person otra) {
        // this.age > otra.getAge();
        int resultComp = Integer.compare(this.age, otra.getAge());

        if (resultComp != 0) {
            return resultComp;
        }

        // Comparar otro parámetro
        return this.name.compareTo(otra.getName());
    }
}

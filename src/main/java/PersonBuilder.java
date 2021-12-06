public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age > 0) {
            this.age = age;
            return this;
        } else {
           throw new IllegalArgumentException("Не может быть отрицательного возраста!!!");
        }
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name != null || surname != null) {
            return new Person(name, surname, age, address);
        } else {
            throw new IllegalStateException("Проверьте ввод имени и фамилии");
        }
    }
}

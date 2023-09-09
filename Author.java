public class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;

    }

}

    public String toString() {
        return (name + " " + email + " " + gen);
    }

    public static void main(String[] args) {
        Author a1 = new Author("Akshay", "ak20040811@gmail.com", 'M');
        System.out.println(a1);
}
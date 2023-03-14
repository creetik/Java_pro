class Employee {
    private String FullName;
    private String Position;
    private String Email;
    private int TelNumber;
    private int Age;

    public Employee(String fullName, String position, String email, int telNumber, int age) {
        this.FullName = fullName;
        this.Position = position;
        this.Email = email;
        this.TelNumber = telNumber;
        this.Age = age;
    }

    public void setFullName(String fullName) {

        this.FullName = fullName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setPosition(String position) {
        this.Position = position;
    }

    public String getPosition() {
        return Position;
    }

    public void setEmail(String email) {

        this.Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setTelNumber(int telNumber) {
        this.TelNumber = telNumber;
    }

    public int getTelNumber() {
        return TelNumber;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int getAge() {
        return Age;
    }
}

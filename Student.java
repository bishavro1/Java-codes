public class Student {
    private String name;
    private double average;
    private String department;
    private String id;

    public Student(String name, double average, String department, String id) {
        this.name = name;
        if (average >= 0.0 && average <= 100.0) {
            this.average = average;
        } else {
            this.average = 0.0;
        }
        this.department = department;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAverage(double average) {
        if (average >= 0.0 && average <= 100.0) {
            this.average = average;
        } else {
            this.average = 0.0;
        }
    }

    public double getAverage() {
        return average;
    }

    public String getLetterGrade() {
        String letterGrade = "F";
        if (average >= 90.0) {
            letterGrade = "A";
        } else if (average >= 80.0) {
            letterGrade = "B";
        } else if (average >= 70.0) {
            letterGrade = "C";
        } else if (average >= 60.0) {
            letterGrade = "D";
        } else if (average >= 50.0) {
            letterGrade = "E";
        }
        return letterGrade;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment()
    {
        return department;
    }
    
    public void setId (String id)
    {
        this.id = id;
    }
    
    public String getId ()
    {
        return id;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Bishojith Deb Avro", 80.0, "SWE", "222-134-023");
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Average: " + student1.getAverage());
        System.out.println("Letter Grade: " + student1.getLetterGrade());
        System.out.println("Department: " + student1.getDepartment());
        System.out.println("Student ID: " + student1.getId());

        Student student2 = new Student("Shakil Talukdar", 90.0, "SWE", "222-134-015");
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Average: " + student2.getAverage());
        System.out.println("Letter Grade: " + student2.getLetterGrade());
        System.out.println("Department: " + student2.getDepartment());
        System.out.println("Student ID: " + student2.getId());
    }
}

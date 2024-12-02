package CIE;

public class Student 
{
    public String usn;
    public String name;
    public int sem;

    public Student(String usn, String name, int sem) 
    {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public int getSem() {
        return sem;
    }
}
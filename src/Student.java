import java.util.List;

public class Student {

    String förNamn,efterNamn, adress, mailAdress;
    int id, födelseÅr;


    public Student (int id, String förNamn, String efterNamn,
                    int födelseÅr, String adress, String mailAdress)
    {
        this.förNamn = förNamn;
        this.efterNamn = efterNamn;
        this.adress = adress;
        this.mailAdress = mailAdress;
        this.id = id;
        this.födelseÅr = födelseÅr;
    }


    public String getFörNamn() {
        return förNamn;
    }

    public void setFörNamn(String förNamn) {
        this.förNamn = förNamn;
    }

    public String getEfterNamn() {
        return efterNamn;
    }

    public void setEfterNamn(String efterNamn) {
        this.efterNamn = efterNamn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public void setMailAdress(String mailAdress) {
        this.mailAdress = mailAdress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFödelseÅr() {
        return födelseÅr;
    }

    public void setFödelseÅr(int födelseÅr) {
        this.födelseÅr = födelseÅr;
    }



    public static Student läggTillStudent(int id, String förNamn, String efterNamn, int födelseÅr, String adress, String mailAdress){
        Student student = new Student(id, förNamn, efterNamn, födelseÅr, adress, mailAdress);
        return student;
    }


    public static void visaStudenter(List<Student> studenter)
    {
        for(Student s : studenter)
        {
            System.out.println("Id: " + s.getId());
            System.out.println("Förnamn: " + s.getFörNamn());
            System.out.println("Efternamn" + s.getEfterNamn());
            System.out.println("Födelseår: " + s.getFödelseÅr());
            System.out.println("Adress: " + s.getAdress());
            System.out.println("Mailadress: " + s.getMailAdress());
        }
    }


    public static void taBortStudent(int id, List<Student> studenter)
    {
        for(Student s : studenter)
        {
            if( s.getId() == id)
            {
                studenter.remove(s);
            }
        }
    }

}

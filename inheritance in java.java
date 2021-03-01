class office
{
private int rno;
private string Sname;
public void setstud(int no,string name)
{
rno=no;
Sname=name;
}
public void putstud()
{
System.out.println("Student regno:"+rno);
System.out.println("Student name:"+Sname);
}
}
class physical extends office
{
protected String gender;
public void setphy(string args[])
{
gender=g;
}
public void putphy()
{
System.out.println("Gender:"+gender);
}
}
class test extends physical
{
private String grade;
public void setmark(string args[])
{
grade=s;
}
public void putmark()
{
System.out.println("Grade:"+grade);
}
public static void main(string args[])
{
test T=new test();
T.setstud(101,"Harish");
T.setphy("Male");
T.setmark("A");
T.putstud();
T.putphy();
T.putmark();
}
}
class Employee
{
int id;
String name;
void setid(int x)
{
id=x;
}
void setname(String n)
{
name=n;
}
void display()
{
System.out.print("ID is "+id+" Name is "+name);
}
public static void main(String geetu[])
{
Employee emp=new Employee();
emp.setid(1127);
emp.setname("Geetansh");
emp.display();
}
}

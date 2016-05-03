class Student{
  String name;
  int age;
public static void main(String[] args){

  Student s1 = new Student();
  s1.name="Krishna";
  s1.age = 26;


  Student s2 = new Student();
  s2.name="Rama";
  s2.age = 25;

  System.out.println("Name of s2 is "+s2.name);
  System.out.println("Age of s2 is "+s2.age);


  System.out.println("Name of s1 is "+s1.name);
  System.out.println("Age of s1 is "+s1.age);

 }
}
package com.example.studentsimplereportdemo;

public class Student
{
    String name;
    String rollno;
    int marks1;
     int marks2;
      int marks3;

      public void set(String n,String r,int m1,int m2,int m3)
      {
        this.name=n;
        this.rollno=r;
        this.marks1=m1;
        this.marks2=m2;
        this.marks3=m3;
      }
      public String getName()
      {
        return name;
      }
        public String getRoll()
      {
        return rollno;
      }
        public int getMarks1()
      {
        return marks1;
      }
        public int getMarks2()
      {
        return marks2;
      }
        public int getMarks3()
      {
        return marks3;
      }
      public float Percentage()
      {
        return (float)(marks1+marks2+marks3)/3;
      }
}




  

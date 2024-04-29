package Analisis;
import java.util.*;
public class Employee {
 protected String name;
 protected double salary;
 protected Date hireday;

 public Employee(String name, double salary, int year,int month, int day){
 this.name = name;
 this.salary = salary;

GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
this.hireday = calendar.getTime();
 }

 public Employee(String name){}// jawaban nomer 3
 
 public Date getHireDay(){
 return hireday;
 }
 public String getName(){
 return name;
 }
 public double getSalary(){
 return salary;
 }
 public void raiseSalary(double byPercent){
 double raise = salary * byPercent/100;
 salary+=raise;
 }
}

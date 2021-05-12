package com.company.lesson5;

public class Employee {

   private String fullName;
   private String position;
   private String email;
   private long phoneNumber;
   private int salary;
   private int age;

   public Employee (String fullName, String position, String email, long phoneNumber, int salary, int age) {
      this.fullName = fullName;
      this.position = position;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.salary = salary;
      this.age = age;
   }

   public void printInfo() {
      StringBuilder info = new StringBuilder();
      if (fullName != null) {
         info.append("Сотрудник: " + fullName + "; ");
      } else {
         info.append("Имя сотрудника не указано, ");
      }
      if (position != null) {
         info.append("должность: " + position + "; ");
      } else {
         info.append("должность сотрудника не указана, ");
      }
      if (email != null) {
         info.append("электронная почта: " + email + "; ");
      } else {
         info.append("электронная почта не указана, ");
      }
      if (phoneNumber >= 0) {
         info.append("телефон: " + phoneNumber + ", ");
      } else {
         info.append("указан некорректный телефон, ");
      }
      if (salary >= 0) {
         info.append("зарплата: " + salary + ", ");
      } else {
         info.append("указана некорректная зарплата, ");
      }
      if (age >= 0) {
         info.append("возраст: " + age);
      } else {
         info.append("возраст указан некорректно.");
      }
      System.out.println(info);
   }

   public int getAge() {
      return age;
   }

}

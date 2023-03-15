package com.company;

abstract class Human {
    public String name;
    public String date;
    public int salary;

    Human(String name, String date, int salary){
        this.name = name;
        this.date = date;
        this.salary = salary;
    }

    abstract public String getName();

    abstract public String getDate();

    abstract public int getSalary();
}

class Director extends Human {
    public String company;

    Director(String name, String date, int salary, String company) {
        super(name, date, salary);
        this.company = company;
    }

    public void setSalaryWorker(Human human, int salary) {
        System.out.println(name + " установил работнику " + human.name + " зарплату в размере " + salary);
        human.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}

class DepartmentHead extends Human {

    DepartmentHead(String name, String date, int salary) {
        super(name, date, salary);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}

class Worker extends Human {

    Worker(String name, String date, int salary) {
        super(name, date, salary);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDate() {
        return date;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}

public class Main {

    public static void main(String[] args) {
        Director director = new Director("Ильдар", "03.08.1976", 100000, "KFC");
        DepartmentHead departmentHead = new DepartmentHead("Владислав", "23.05.1981", 80000);
        Worker worker = new Worker("Артём", "15.01.1996", 50000);
        System.out.println(director.getName());
        System.out.println(director.getDate());
        System.out.println(director.getSalary());
        System.out.println(director.getCompany());
        System.out.println(departmentHead.getName());
        System.out.println(departmentHead.getDate());
        System.out.println(departmentHead.getSalary());
        System.out.println(worker.getName());
        System.out.println(worker.getDate());
        System.out.println(worker.getSalary());
        director.setSalaryWorker(worker, 40000);
        System.out.println(worker.getSalary());
    }
}
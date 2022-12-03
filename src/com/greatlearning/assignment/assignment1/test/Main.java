package com.greatlearning.assignment.assignment1.test;

import com.greatlearning.assignment.assignment1.model.AdminDepartment;
import com.greatlearning.assignment.assignment1.model.HrDepartment;
import com.greatlearning.assignment.assignment1.model.SuperDepartment;
import com.greatlearning.assignment.assignment1.model.TechDepartment;

public class Main {
    public static void main (String[] args) {

        SuperDepartment adminDept = new AdminDepartment ();
        System.out.println ("Welcome to " + adminDept.departmentName ());
        System.out.println (adminDept.getTodaysWork ());
        System.out.println (adminDept.getWorkDeadline ());
        System.out.println (adminDept.isTodayAHoliday ());


        System.out.print ("\n");

        HrDepartment hrDept = new HrDepartment ();
        System.out.println ("Welcome to " + hrDept.departmentName ());
        System.out.println (hrDept.doActivity ());
        System.out.println (hrDept.getTodaysWork ());
        System.out.println (hrDept.getWorkDeadline ());
        System.out.println (hrDept.isTodayAHoliday ());

        System.out.print ("\n");

        TechDepartment techDept = new TechDepartment ();
        System.out.println ("Welcome to " + techDept.departmentName ());
        System.out.println (techDept.getTodaysWork ());
        System.out.println (techDept.getWorkDeadline ());
        System.out.println (techDept.getTechStackInformation ());
        System.out.println (techDept.isTodayAHoliday ());

    }
}

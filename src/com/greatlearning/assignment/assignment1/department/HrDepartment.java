package com.greatlearning.assignment.assignment1.department;

public class HrDepartment extends SuperDepartment {
    @Override
    public String departmentName () {
        return "Hr Department";
    }

    @Override
    public String getTodaysWork () {
        return "Fill today’s timesheet and mark your attendance";
    }

    @Override
    public String getWorkDeadline () {
        return "Complete by EOD";
    }

    public String doActivity () {
        return "team lunch";
    }
}

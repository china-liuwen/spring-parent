package com.entity;

import java.util.List;

public class EmpVO {
    private List<Emp> emps;

    public List<Emp> getEmps(){
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "EmpVO{" +
                "emps=" + emps +
                '}';
    }
}

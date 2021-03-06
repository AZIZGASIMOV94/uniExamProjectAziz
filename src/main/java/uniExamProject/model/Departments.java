package uniExamProject.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Departments {

    @Id
    @Column(name = "dept_no", nullable = false)
    private Long dept_no;

    @Column(name = "dept_name", nullable = false)
    private String dept_name;

    public Departments() {

    }


    /*@ManyToMany(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "departments"
    )
    private Collection<Employees> employees;

    public Collection<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employees> employees) {
        this.employees = employees;
    }*/

    /*@OneToMany(mappedBy = "departments", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<DeptEmployee> deptEmployee;

    @OneToMany(mappedBy = "departments", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Collection<DeptManager> deptManagers;*/

    /*public Collection<DeptManager> getDeptManagers() {
        return deptManagers;
    }

    public void setDeptManagers(Collection<DeptManager> deptManagers) {
        this.deptManagers = deptManagers;
    }

    public Collection<DeptEmployee> getDeptEmployee() {
        return deptEmployee;
    }

    public void setDeptEmployee(Collection<DeptEmployee> deptEmployee) {
        this.deptEmployee = deptEmployee;
    }*/

    public Long getDept_no() {
        return dept_no;
    }

    public void setDept_no(Long dept_no) {
        this.dept_no = dept_no;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "dept_no=" + dept_no +
                ", dept_name='" + dept_name + '\'' +
                '}';
    }
}

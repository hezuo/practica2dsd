package upc.edu.practica2.servicios;

import java.util.ArrayList;
import java.util.List;
import upc.edu.practica2.model.Student;

/**
 *
 * @author cesar
 */
public class StudentService {
    
    List<Student> students = new ArrayList<Student>();
    
    public StudentService() {
        this.students.add(new Student("1", "Juan", "Perez"));
        this.students.add(new Student("2", "CArlos", "Sanchez"));
        this.students.add(new Student("3", "Pedro", "Suarez"));
        this.students.add(new Student("4", "Mario", "Perez1"));
        this.students.add(new Student("5", "MArco", "Perez2"));        
    }
    
    public List<Student> getStudents() {
        return this.students;
    }
    
    public Student getStudent(String codigo) {
        Student student = new Student();
        
        for (Student st : this.students) {
            if (st.getCodigo().equalsIgnoreCase(codigo)) {
                student = st;
                break;
            }
        }
        
        return student;
    }
    
    public Student editStudent(String codigo, Student student) {        
        for (Student st : this.students) {
            if (st.getCodigo().equalsIgnoreCase(codigo)) {
                int index = this.students.indexOf(st);
                this.students.set(index, student);
                break;
            }
        }
        
        return student;
    }
    
    public List<Student> removeStudent(String codigo) {        
        for (Student st : this.students) {
            if (st.getCodigo().equalsIgnoreCase(codigo)) {
                int index = this.students.indexOf(st);
                this.students.remove(index);
                break;
            }
        }
        
        return this.students;
    }
    
    public List<Student> addStudent(Student student) {        
        this.students.add(student);
        
        return this.students;
    }
}

package task13;

import java.util.ArrayList;
import java.util.List;

public class Function {
    public void deleteStudent(){
        List<Student> student = new ArrayList<>();
        student.addAll(student);
        for(int i = 0; i < student.size(); i++){
            if(student.get(i).getAverageBall() <= 4.00)
                student.remove(i);
        }
    }

}

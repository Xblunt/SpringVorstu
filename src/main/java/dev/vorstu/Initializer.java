package dev.vorstu;

import dev.vorstu.dto.Student;
import dev.vorstu.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Initializer {

    @Autowired
    private StudentRepository studentRepository;


    public void initial() {
        studentRepository.save(new Student("Ignat", "g1", "+7999"));
        studentRepository.save(new Student("Masson", "g2", "+7988"));
        studentRepository.save(new Student("Kbup", "g2", "+7977"));
        studentRepository.save(new Student("Astak", "g3", "+7966"));
    }
}
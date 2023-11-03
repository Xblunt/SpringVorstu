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
        studentRepository.save(new Student("rrrr", "g4", "+7988"));
        studentRepository.save(new Student("ttt", "g4", "+7933"));
        studentRepository.save(new Student("yyy", "g5", "+7922"));
        studentRepository.save(new Student("uuu", "g5", "+7911"));
        studentRepository.save(new Student("iii", "g6", "+7977"));
        studentRepository.save(new Student("ooo", "g7", "+7900"));
        studentRepository.save(new Student("ppp", "g8", "+7966"));
        studentRepository.save(new Student("fff", "g9", "+7944"));
        studentRepository.save(new Student("bbb", "g10", "+7933"));


    }
}
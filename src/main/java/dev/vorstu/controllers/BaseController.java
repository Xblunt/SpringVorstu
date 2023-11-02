package dev.vorstu.controllers;



//import org.springframework.http.MediaType;

import dev.vorstu.dto.Student;
import dev.vorstu.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
//import javax.rmi.CORBA.Stub;

@RestController
@RequestMapping("/api/base")

public class BaseController {
    private final StudentRepository studentRepository;
    @Autowired

    public BaseController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
//
//    @GetMapping("/students")
//    public List<Student> students(){
//        return (List)studentRepository.findAll();

//    @GetMapping("/students")
//        public List<Student> students() {
//            return (List)studentRepository.findAll();
//        }
//    @GetMapping("/students")
//    public Page<Student> getAllStudents(@PageableDefault(size = 2) int page, Pageable pageable) {return studentRepository.findAll(pageable);}


//    @GetMapping("/students")
//    public Page<Student> getAllStudents(@RequestParam(defaultValue = "0") int page,
//                                        @RequestParam(defaultValue = "2") int size,
//                                        @RequestParam(defaultValue = "id") String sortBy) {
//        PageRequest pageRequest = PageRequest.of(page, size, Sort.by(sortBy));
//        return studentRepository.findAll(pageRequest);
//    }






//    @GetMapping("/students")
//    public Page<StudentRepository> getAllStudents(@RequestParam( defaultValue = "0") int page,
//                                   @RequestParam( defaultValue = "2") int size,
//                                  @RequestParam(defaultValue = "id") String sortBy)
//    {
////        PageRequest pageRequest = PageRequest.of(page, size);
//        PageRequest pageRequest = PageRequest.of(page,size, Sort.by(sortBy));
//        return StudentRepository.findAll(pageRequest);

//        @GetMapping("users/{pageIndex}/{pageSize}")
//        public Page<AuthUserEntity> getAllUsers(@PathVariable("pageIndex")int pageIndex,
//        @PathVariable("pageSize")int pageSize) {
//            return authUserRepo.findAll(PageRequest.of(pageIndex,pageSize, (Sort) Sort.by("id")));
//        return new PageImpl<>(pageRequest, pageResult.getAllStudents());

//    }
//    @PostMapping(value="/students", produces = MediaType.APPLICATION_JSON_VALUE)



//    @GetMapping("/students")
//    public Page<Student> geAllStudents(
//            @RequestParam(defaultValue = "0") int page,
//            @RequestParam(defaultValue = "2") int size,
//            @RequestParam(defaultValue = "id") String sortBy
//    ) {
//        PageRequest pageRequest = PageRequest.of(page, size, Sort.by(sortBy));
//        return studentRepository.findAll(pageRequest);
//    }

//        @GetMapping("/students")
//    public Page<Student> getAllStudents(@RequestParam(defaultValue = "0") int page,
//                                        @RequestParam(defaultValue = "2") int size,
//                                        @RequestParam(defaultValue = "id") String sortBy) {
//        PageRequest pageRequest = PageRequest.of(page, size, Sort.by(sortBy));
//        return studentRepository.findAll(pageRequest);
//    }

    @GetMapping("/students")
    public Page<Student> geAllStudents(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "2") int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        return studentRepository.findAll(pageRequest);
    }
//    @GetMapping("/students")
//    public List<Student> students() {
//        return (List)studentRepository.findAll();
//    }
    @PostMapping(value = "/students", consumes = "application/json", produces = "application/json")
//          value = "/students", produces = "application/json")
    public Student createStudent(@RequestBody Student newStudent){
        studentRepository.save(newStudent);
        return newStudent;
        }
    @PutMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student changeStudent(@RequestBody Student changingStudent){
        return studentRepository.save(changingStudent);
    }
    @DeleteMapping (value = "students/{id}", consumes = "application/json", produces = "application/json")
    public Long deleteStudent(@PathVariable("id")Long id)
    {
//        return  removeStudent(id);
        studentRepository.deleteById(id);
        return id;
    }
//    private  Long counter = 0L;
//    private Long generateId() {return  counter++;}
//    private final List<Student> students = new ArrayList<>();
//    List<Student> students;
//    @PostConstruct
//    private  void  init(){
//        students = new ArrayList<>();
//        students.add(new Student(generateId(),  "Andr",  "bm", "+77"));
//        students.add(new Student(generateId(),  "Oleg",  "vm",  "+78"));
//        students.add(new Student(generateId(),  "Ilya",  "bgv",  "+79"));
//    }

//    @GetMapping("getAllStudents")
//        public List<Student> getAllStudents(){
//        return students;
//
//    }
//    @GetMapping("/students")
//        public Page<Student> getStudents(@PageableDefault(size = 2) Pageable pageable){
//       return studentRepository.findAll(pageable);
//   }
//    private Student addStudent(Student student){
//        student.setId(generateId());
//        students.add(student);
//        return student;
//
//    }

//    @GetMapping("check")
//    public String getAllUsers(){
//        return "Hello world " + new Date();
//    }
//    @GetMapping("students")
//    public List<Student> getAllStudents(){
//        return students;
//    }

//    private  Student updateStudent( Student student){
//        if(student.getId() == null){
//            throw new RuntimeException("id of changing student cannot be null");
//        }
//        Student changingStudent = students.stream()
//                .filter(el -> el.getId().equals(student.getId()))
//                .findFirst().orElseThrow(() -> new RuntimeException("student with id:" + student.getId() + " not found"));
//        changingStudent.setFio(student.getFio());
//        changingStudent.setGroup(student.getGroup());
//        changingStudent.setPhoneNumber(student.getPhoneNumber());
//        return student;
//    }

//    private  Long removeStudent(Long id) {
//        students.removeIf(el -> el.getId().equals(id));
//        return id;
//    }
}

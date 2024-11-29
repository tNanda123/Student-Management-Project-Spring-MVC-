package com.nanda.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nanda.entity.Student;
import com.nanda.repositary.StudentRepo;
import com.nanda.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
	}
}

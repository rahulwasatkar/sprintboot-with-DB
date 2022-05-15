package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entity.Student;
@Repository
public class studentdao_impl implements studentdao {
      
	@Autowired
	private SessionFactory sf;
	
	
	@Override
	public Student savestudent(Student student) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        try {
			session.save(student);
			transaction.commit();
		} catch (Exception e) {
			
			e.printStackTrace();
			return null;
		}
        finally {
        	session.close();
			
		}
        
		return student;
	}

	@Override
	public Student getstudent(String studentid) {
		Session session = sf.openSession();
		Student student = null;

		try {
			student = session.get(Student.class, studentid);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return student;
	}

	@Override
	public List<Student> getallstudent() {
		Session session = sf.openSession();
		Student student = null;
		try {
			student = session.
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return student;
		
	}

	@Override
	public boolean deletestudentbyid(String studentid) {
		return false;
	}

	@Override
	public Student updatestudent(Student student) {

		return null;
	}

}

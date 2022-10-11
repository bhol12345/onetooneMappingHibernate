package org.virtusa.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.virtusa.app.util.HibUtil;

public class Test {

	public static void main(String[] args) {
		SessionFactory factory=HibUtil.getSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		StudentDetails studetntDetails=new StudentDetails();
		studetntDetails.setLinkedUrl("dscs");
		studetntDetails.setAge(30);
		Student student=new Student();
		student.setName("Dibyajit");
		student.setAddress("Baripada");
		student.setStudentDetails(studetntDetails);
		session.save(studetntDetails);
		session.save(student);
		tx.commit();
		session.close();
		
		

	}

}

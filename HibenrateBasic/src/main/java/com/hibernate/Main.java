package com.hibernate;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernate.model.Book;
import com.hibernate.model.User;
import com.hibernate.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Book book = session.get(Book.class, 1);
		System.out.println(book.getTitle());
		//System.out.println(book.getReviews().size());
		session.close();
		
	}
	
	public static void criteriaEx(Session session) {
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<User> createQuery = criteriaBuilder.createQuery(User.class);
		createQuery.from(User.class);
		
        List<User> users = session.createQuery(createQuery).getResultList();
		users.forEach(System.out::println);
	}
}

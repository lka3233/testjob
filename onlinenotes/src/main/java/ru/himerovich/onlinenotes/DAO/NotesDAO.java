package ru.himerovich.onlinenotes.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.himerovich.onlinenotes.models.Note;

import java.util.List;

public class NotesDAO implements NotesDAOInterface{
    @Override
    public List<Note> findByTitle(String title) {
        Session session = HibernateSessionFactoryInitiation.getSessionFactory().openSession();
        List<Note> noteList = (List<Note>) session.createQuery("From Note where title like :title").setParameter("title","%"+title+"%").list();
        session.close();
        return noteList;
    }

    @Override
    public List<Note> findByBody(String body) {
        Session session = HibernateSessionFactoryInitiation.getSessionFactory().openSession();
        List<Note> noteList = (List<Note>) session.createQuery("From Note where body like :body").setParameter("body","%"+body+"%").list();
        session.close();
        return noteList;
    }

    @Override
    public void save(Note note) {
        Session session = HibernateSessionFactoryInitiation.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(note);
        tx.commit();
        session.close();
    }
    @Override
    public void update(Note note) {
        Session session = HibernateSessionFactoryInitiation.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(note);
        tx.commit();
        session.close();
    }

    @Override
    public List<Note> getAll() {
        Session session = HibernateSessionFactoryInitiation.getSessionFactory().openSession();
        List<Note> noteList =(List<Note>)session.createQuery("From Note").list();
        session.close();
        return noteList;
    }

    @Override
    public void delete(int id) {
        Session session = HibernateSessionFactoryInitiation.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Note note = session.get(Note.class,id);
        session.delete(note);
        tx.commit();
        session.close();
    }

    @Override
    public Note getByID(int id) {
        Session session = HibernateSessionFactoryInitiation.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Note note = session.get(Note.class,id);
        session.close();
        return note;
    }
}

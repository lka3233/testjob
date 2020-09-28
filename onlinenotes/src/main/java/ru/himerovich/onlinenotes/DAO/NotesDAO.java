package ru.himerovich.onlinenotes.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.himerovich.onlinenotes.models.Note;

import java.util.List;

public class NotesDAO implements NotesDAOInterface{
    @Override
    public Note findByTitle(int id) {
        return HibernateSessionFactoryInitiation.getSessionFactory().openSession().get(Note.class,id);
    }

    @Override
    public Note findByBody(String body) {
        return null;
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
        session.update(note);
        tx.commit();
        session.close();
    }

    @Override
    public List<Note> getAll() {
        List<Note> noteList =(List<Note>) HibernateSessionFactoryInitiation.getSessionFactory().openSession().createQuery("From Note").list();
        return noteList;
    }

    @Override
    public void delete(Note note) {
        Session session = HibernateSessionFactoryInitiation.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(note);
        tx.commit();
        session.close();
    }
}

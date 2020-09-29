package ru.himerovich.onlinenotes.services;

import ru.himerovich.onlinenotes.DAO.NotesDAO;
import ru.himerovich.onlinenotes.models.Note;

import java.util.List;

public class DBOperations {
    private static NotesDAO dao = new NotesDAO();

    public static Note getById(int id) {
        return dao.getByID(id);
    }

    public static void save(Note note) {
        dao.save(note);
    }

    public static void delete(int id) {
        dao.delete(id);
    }

    public static void update(Note note, int id) {
        dao.update(note);
    }

    public static List<Note> getAll() {
        return dao.getAll();
    }

    public static List<Note> searhByTitle(String title){ return dao.findByTitle(title); }

    public static List<Note> searhByBody(String body){ return dao.findByBody(body); }
}

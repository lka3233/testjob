package ru.himerovich.onlinenotes.services;

import ru.himerovich.onlinenotes.DAO.NotesDAO;
import ru.himerovich.onlinenotes.models.Note;

import java.util.List;

public class DBOperations {
    private static NotesDAO dao = new NotesDAO();

    public static Note findByTitle(int title) {
        return dao.findByTitle(title);
    }

    public static void save(Note note) {
        dao.save(note);
    }

    public static void delete(Note note) {
        dao.delete(note);
    }

    public static void updateUser(Note note) {
        dao.update(note);
    }

    public static List<Note> getAll() {
        return dao.getAll();
    }
}

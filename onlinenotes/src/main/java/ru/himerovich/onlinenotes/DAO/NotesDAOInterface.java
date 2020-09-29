package ru.himerovich.onlinenotes.DAO;
import ru.himerovich.onlinenotes.models.Note;

import java.util.List;

public interface NotesDAOInterface {
    Note getByID(int id);
    List<Note> findByTitle(String title);
    List<Note> findByBody(String body);
    void save(Note note);
    void update(Note note);
    void delete (int id);
    List<Note> getAll();

}

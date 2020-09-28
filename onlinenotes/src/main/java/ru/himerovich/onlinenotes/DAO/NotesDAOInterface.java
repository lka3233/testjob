package ru.himerovich.onlinenotes.DAO;
import ru.himerovich.onlinenotes.models.Note;

import java.util.List;

public interface NotesDAOInterface {
    Note findByTitle(int id);
    Note findByBody(String body);
    void save(Note note);
    void update(Note note);
    void delete (Note note);
    List<Note> getAll();

}

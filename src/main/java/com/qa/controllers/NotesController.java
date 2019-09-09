package com.qa.controllers;

import java.util.List;
import com.qa.models.Note;
import com.qa.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
public class NotesController {
    @Autowired
    private NotesRepository repo;

    @RequestMapping(value = "notes", method = RequestMethod.GET)
    public List<Note> listAllNotes() {
        return repo.findAll();
    }

    @RequestMapping(value = "notes", method = RequestMethod.POST)
    public Note addNote(@RequestBody Note note) {
        return repo.saveAndFlush(note);
    }

}

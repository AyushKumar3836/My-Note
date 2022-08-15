package com.neatroots.mynotemvvm;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
// changing name of database from Note to myNotes
@Entity(tableName = "my_notes")
public class Note {
    private String title;
    private String disp;

// applying primary key on id
    @PrimaryKey(autoGenerate = true)
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Note(String title, String disp) {
        this.disp = disp;
        this.title=title;
    }

    public String getDisp() {
        return disp;
    }

    public void setDisp(String disp) {
        this.disp = disp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

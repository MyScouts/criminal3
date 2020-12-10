package com.uni.officecriminal.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Criminal {
    String title;
    String descriptiom;
    String imagePath;
    Boolean solved;
    Date creationDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptiom() {
        return descriptiom;
    }

    public void setDescriptiom(String descriptiom) {
        this.descriptiom = descriptiom;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Boolean isSolved() {
        return solved;
    }

    public void setSolved(Boolean solved) {
        this.solved = solved;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Criminal(String title, Date creationDate) {
        this.title = title;
        this.creationDate = creationDate;
    }

    public Criminal() {
    }

    public static List<Criminal> createCriminals() {
        List<Criminal> criminals = new ArrayList<>();
        for (int i=0; i<100; i++) {
            String title = String.format("Criminal #%d", i);
            Date date = new Date();
            criminals.add(new Criminal(
                title, date
            ));
        }

        return criminals;
    }
}

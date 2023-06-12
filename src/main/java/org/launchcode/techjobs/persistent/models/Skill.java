package org.launchcode.techjobs.persistent.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
   @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs=new ArrayList<>();
    @NotBlank
    @NotNull
    @Size(min = 1, max = 350)
    public String description;

    public Skill(){}

    public String getDescription() {
        return description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
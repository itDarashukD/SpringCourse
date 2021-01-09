package org.hibernate.many_to_many.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "children")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
    @JoinTable(name = "child_section"
    ,joinColumns = @JoinColumn(name = "child_id")
    ,inverseJoinColumns = @JoinColumn(name = "section_id"))
    private List<Section> sectionList;

    public Child() {
    }

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void addSectionToChild(Section section){
        if (sectionList == null) {
            sectionList=new ArrayList<>();
        } sectionList.add(section);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Section> getSectionList() {
        return sectionList;
    }

    public void setSectionList(List<Section> sectionList) {
        this.sectionList = sectionList;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

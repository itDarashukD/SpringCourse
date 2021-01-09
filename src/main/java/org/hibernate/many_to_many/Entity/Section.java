package org.hibernate.many_to_many.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
    @JoinTable(name = "child_section"
            ,joinColumns =@JoinColumn(name = "section_id")
            ,inverseJoinColumns = @JoinColumn(name = "child_id"))
     private List<Child>childList;



    public Section() {
    }

    public Section(String name) {
        this.name = name;
    }
        public void addChildsToSection(Child child){
            if (childList == null) {
                childList= new ArrayList<>();
            }childList.add(child);
        }


    public long getId() {
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

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

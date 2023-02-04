package ua.osadchuk.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person owner;
    @NotEmpty(message = "Item name should not be empty")
    @Column(name = "item_name")
    private String itemName;

    public Item() {
    }

    public Item(Person owner, String itemName) {
        this.owner = owner;
        this.itemName = itemName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return owner;
    }

    public void setPerson(Person person) {
        this.owner = person;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", person=" + owner +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
